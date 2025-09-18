import java.util.*;

class BankAccount {
    static String bankName = "Default Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount.bankName = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            sc.nextLine();
            String holder = sc.nextLine();
            double balance = sc.nextDouble();
            sc.nextLine();
            BankAccount acc = new BankAccount(number, holder, balance);
            acc.displayDetails();
        }
        BankAccount.getTotalAccounts();
    }
}