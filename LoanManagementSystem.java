import java.util.Scanner;

abstract class Loan {
    protected double principal;
    protected double rate;
    protected int time;

    public Loan(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateInterest() {
        return (principal * rate * time) / 100.0;
    }
}

class HomeLoan extends Loan {
    public HomeLoan(double principal, int time) {
        super(principal, 8.0, time);
    }

    @Override
    public String toString() {
        return "Home Loan Interest: " + calculateInterest();
    }
}

class CarLoan extends Loan {
    public CarLoan(double principal, int time) {
        super(principal, 10.0, time);
    }

    @Override
    public String toString() {
        return "Car Loan Interest: " + calculateInterest();
    }
}

public class LoanManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] p = line.split(",\\s*");
            if (p[0].equalsIgnoreCase("Home")) {
                System.out.println(new HomeLoan(Double.parseDouble(p[1]), Integer.parseInt(p[2])));
            } else {
                System.out.println(new CarLoan(Double.parseDouble(p[1]), Integer.parseInt(p[2])));
            }
        }
    }
}