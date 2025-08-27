import java.util.Scanner;

public class FineCalculator {
    public static int fineCal(int daysLate) {
        int fine = 0;
        if(daysLate <= 5) {
            fine = daysLate * 10; 
        } else if(daysLate <= 10) {
            fine = (5 * 10) + ((daysLate - 5) * 20); 
        } else {
            fine = (5 * 10) + (5 * 20) + ((daysLate - 10) * 50);
        }
        return fine;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fine = 0;
        boolean j = true;
        while(j) {
            System.out.println("Calculating fine for current student ");
            System.out.println("Enter the number of items borrowed:");
            int numberOfItemsBorrowed = sc.nextInt();
            for(int i = 0; i < numberOfItemsBorrowed; i++) {
                System.out.println("Enter the type of " + (i+1)+" item (regular, reference, magazine): 1 , 2 , 3 respectively");
                int itemType = sc.nextInt();
                System.out.println("Enter the number of days late:");
                int daysLate = sc.nextInt();
                fine += fineCal(daysLate);
            }
            System.out.println("Total fine for cureent student"+": " + fine + " rupees");
            System.out.println("------------------------------");
            System.out.println("Do you want to check fine for another student? (yes/no)");
            if(sc.next().equalsIgnoreCase("no")) {
                break;
            }
            fine = 0;
            }
            System.out.println("Exiting the program. Goodbye!");
        }
        
    }

