import java.util.Scanner;

class Vehicle {
    protected String regNo;
    protected String brand;
    protected double baseRate;

    public Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {
    public Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.5;
    }

    @Override
    public String toString() {
        return "Car " + regNo + " " + brand + " Rent: " + calculateRent();
    }
}

class Bike extends Vehicle {
    public Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.2;
    }

    @Override
    public String toString() {
        return "Bike " + regNo + " " + brand + " Rent: " + calculateRent();
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] p = line.split(",\\s*");
            if (p[0].equalsIgnoreCase("Car")) {
                System.out.println(new Car(p[1], p[2], Double.parseDouble(p[3])));
            } else if (p[0].equalsIgnoreCase("Bike")) {
                System.out.println(new Bike(p[1], p[2], Double.parseDouble(p[3])));
            }
        }
        sc.close();
    }
}