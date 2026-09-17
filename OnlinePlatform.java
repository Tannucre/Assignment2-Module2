import java.util.Scanner;

class Course {
    String courseName;
    String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class Student {
    protected String name;
    protected Course enrolledCourse;

    public Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name + " Course: " + enrolledCourse.courseName + " (" + enrolledCourse.duration + ")";
    }
}

class PremiumStudent extends Student {
    private int discount;

    public PremiumStudent(String name, Course enrolledCourse, int discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + name + " Course: " + enrolledCourse.courseName + " (" + enrolledCourse.duration + ") Discount: " + discount + "%";
    }
}

public class OnlinePlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] c = sc.nextLine().trim().split(",\\s*");
        Course course = new Course(c[0], c[1]);

        String[] s1 = sc.nextLine().trim().split(",\\s*");
        Student student = new Student(s1[0], course);

        String[] s2 = sc.nextLine().trim().split(",\\s*");
        PremiumStudent premiumStudent = new PremiumStudent(s2[0], course, Integer.parseInt(s2[2]));

        System.out.println(student);
        System.out.println(premiumStudent);

        sc.close();
    }
}