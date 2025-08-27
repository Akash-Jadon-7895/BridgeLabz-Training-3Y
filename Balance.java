import java.util.Scanner;

public class Balance {
    public static void processTransaction(int balance) {
        System.out.println("What action do you want to perform?");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice (1-3): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited: " + depositAmount + " rupees");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrew: " + withdrawAmount + " rupees");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + balance + " rupees");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 3.");
            }
    }
    
    public static void main(String[] args) {
        
        int balance = 0;
        boolean moreTransactions = true;
        while(moreTransactions) {
            if(balance < 0) {
                System.out.println("Your account is overdrft. Please deposit funds to continue.");
            }
            processTransaction(balance);
            Scanner sc = new Scanner(System.in);
            System.out.print("Do you want to perform another transaction? (yes/no): ");
            String ans = sc.next();
            if (!ans.equalsIgnoreCase("yes")) {
                moreTransactions = false;
            }
        }
    }
}
