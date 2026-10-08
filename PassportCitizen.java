import java.util.Scanner;

class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    public Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport: " + passportNo + " Issue: " + issueDate + " Expiry: " + expiryDate;
    }
}

class Citizen {
    private String name;
    private String dob;
    private String address;
    private Passport passport;

    public Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name + " DOB: " + dob + " Address: " + address + "\n" + passport.toString();
    }
}

public class PassportCitizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] c = sc.nextLine().trim().split(",\\s*");

        
        String[] p = sc.nextLine().trim().split(",\\s*");

        Passport passport = new Passport(p[0], p[1], p[2]);
        Citizen citizen = new Citizen(c[0], c[1], c[2], passport);

        System.out.println(citizen);
        sc.close();
    }
}