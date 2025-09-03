import java.util.*;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String holder = sc.nextLine();
        int number = sc.nextInt();
        double balance = sc.nextDouble();
        BankAccount b = new BankAccount(holder, number, balance);
        int choice;
        do {
            choice = sc.nextInt();
            if (choice == 1) {
                double amt = sc.nextDouble();
                b.deposit(amt);
            } else if (choice == 2) {
                double amt = sc.nextDouble();
                b.withdraw(amt);
            } else if (choice == 3) {
                b.displayBalance();
            }
        } while (choice != 4);
    }
}
