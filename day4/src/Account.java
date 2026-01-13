import java.util.Scanner;
class Account {
    static int counter = 1;
    int accountNumber;
    String name;
    String accountType;
    double balance;
    int day, month, year;
    Account(String name, String accountType,
            double initialBalance, int d, int m, int y) {
        this.accountNumber = counter++;
        this.name = name;
        this.accountType = accountType;
        this.balance = initialBalance;
        this.day = d;
        this.month = m;
        this.year = y;
    }
    public void checkBalance() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + name);
        System.out.println("Current Balance: Rs " + balance);
    }
    public void deposit(double amount, int d, int m, int y) {
        balance += amount;
        this.day = d;
        this.month = m;
        this.year = y;
        System.out.println("Successfully deposited Rs " + amount);
        System.out.println("Last Deposit Date: " + day + "/" + month + "/" + year);
    }
    public void withdraw(double amount) {
        System.out.println("Generic withdrawal processing...");
    }
}
class StandardAccount extends Account {
    public StandardAccount(String name, double initialBalance, int d, int m, int y) {
        super(name, "Standard", initialBalance, d, m, y);
    }
    public void withdraw(double amount) {
        if (amount <= 100000) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn Rs " + amount + " (Free of charge)");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else if (amount <= 500000) {
            double penalty = amount * 0.0005;
            if (balance >= (amount + penalty)) {
                balance -= (amount + penalty);
                System.out.println("Withdrawn Rs " + amount + " with Rs " + penalty + " penalty (0.05%)");
            } else {
                System.out.println("Insufficient balance to cover withdrawal and penalty.");
            }
        } else {
            System.out.println("Standard accounts cannot withdraw more than Rs 5 lakh per day.");
        }
    }
}
class PremiumAccount extends Account {
    public PremiumAccount(String name, double initialBalance, int d, int m, int y) {
        super(name, "Premium", initialBalance, d, m, y);
    }
    public void withdraw(double amount) {
        if (amount <= 1000000) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn Rs " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Premium accounts cannot withdraw more than Rs 10 lakh per day.");
        }
    }
}
class BankSystem {
    public static void main(String[] args) {
        Account ref;
        StandardAccount sa = new StandardAccount("Harry", 600000, 5, 1, 2026);
        PremiumAccount pa = new PremiumAccount("Joe", 1500000, 6, 1, 2026);
        System.out.println("STANDARD ACCOUNT");
        ref = sa;
        ref.checkBalance();
        ref.deposit(50000, 7, 1, 2026);
        ref.withdraw(400000);
        ref.checkBalance();
        System.out.println("PREMIUM ACCOUNT");
        ref = pa;
        ref.checkBalance();
        ref.withdraw(800000);
        ref.checkBalance();
    }
}