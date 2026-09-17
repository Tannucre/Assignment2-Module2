import java.util.Scanner;

class Account {
    private String accNo;
    private String holderName;
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(String accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void getBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankingSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Line 1: 3
        int n = Integer.parseInt(sc.nextLine().trim());
        Account account = new Account();

        while (n-- > 0) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] cmd = line.split("\\s+");
            if (cmd[0].equalsIgnoreCase("deposit")) {
                account.deposit(Double.parseDouble(cmd[1]));
            } else if (cmd[0].equalsIgnoreCase("withdraw")) {
                account.withdraw(Double.parseDouble(cmd[1]));
            } else if (cmd[0].equalsIgnoreCase("getBalance")) {
                account.getBalance();
            }
        }
        sc.close();
    }
}