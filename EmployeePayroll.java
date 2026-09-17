import java.util.Scanner;

class Employee {
    protected String name;
    protected String id;
    protected double basicSalary;

    public Employee() {
        this.name = "";
        this.id = "";
        this.basicSalary = 0.0;
    }

    public Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read and split Employee line
        String[] e = sc.nextLine().split(",\\s*");
        Employee emp = new Employee(e[1], e[2], Double.parseDouble(e[3]));

        // Read and split Manager line
        String[] m = sc.nextLine().split(",\\s*");
        Manager mgr = new Manager(m[1], m[2], Double.parseDouble(m[3]), Double.parseDouble(m[4]));

        // Print both
        System.out.println(emp);
        System.out.println(mgr);

        sc.close();
    }
}