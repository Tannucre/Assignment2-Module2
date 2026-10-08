import java.util.Scanner;

class Room {
    private String roomNumber;
    private String block;
    private String type;

    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String getRoomNumber() { return roomNumber; }
    public String getBlock() { return block; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Room: " + roomNumber + " " + block + " " + type + ".";
    }
}

class Student {
    private String name;
    private String roll;
    private String course;
    private Room room;

    public Student(String name, String roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course + "\n" + room;
    }
}

public class UniversityHostelAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().trim().split(",\\s*");

        String[] r = sc.nextLine().trim().split(",\\s*");

        Room room = new Room(r[0], r[1], r[2]);
        Student student = new Student(s[0], s[1], s[2], room);

        System.out.println(student);
        sc.close();
    }
}