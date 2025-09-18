package OOPS.Abstraction;

abstract class Account {
    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance = " + balance);
    }

    public abstract void withdraw(double amount);
    public abstract void calculateInterest();
}

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance = " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest added = " + interest + ". New balance = " + balance);
    }
}

class CurrentAccount extends Account {
    private static final double INTEREST_RATE = 0.01; // 1%

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (balance - amount >= -10000) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance = " + balance);
        } else {
            System.out.println("Overdraft limit exceeded in Current Account!");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest added = " + interest + ". New balance = " + balance);
    }
}

public class BankStatement {
    public static void main(String[] args) {

        Account savings = new SavingsAccount(101, "Amit", 5000);
        Account current = new CurrentAccount(102, "Rohit", 10000);

        System.out.println("\n--- Savings Account Transactions ---");
        savings.deposit(2000);
        savings.withdraw(3000);
        savings.calculateInterest();

        System.out.println("\n--- Current Account Transactions ---");
        current.deposit(5000);
        current.withdraw(12000);
        current.calculateInterest();

    }
}
