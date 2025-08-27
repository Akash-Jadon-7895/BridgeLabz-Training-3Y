import java.util.Scanner;

public class FitnessCenterMembershipSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Fitness Center Membership System");
        System.out.println("Available Membership Plans: 1. Monthly 2. Quarterly 3. Yearly");
        System.out.println("Fees: Monthly-100, Quarterly-250, Yearly-900");
        Scanner sc = new Scanner(System.in);
        boolean continueBooking = true;
        int totalAmount = 0;
        String[] plans = {"Monthly", "Quarterly", "Yearly"};
        while(continueBooking){
            System.out.println("Are you a student or senior citizen? (1-student/senior citizen / 0-No)");
            int isStudentOrSenior = sc.nextInt();
            if(isStudentOrSenior == 1){
                System.out.println("You get a 10% discount on all plans!");
            }
            System.out.println("Choose your membership plan (1-3): ");
            int choice = sc.nextInt();
            int fee = 0;        
            switch (choice) {
                case 1:
                    fee = 100;
                    break;
                case 2:
                    fee = 250;
                    break;
                case 3:
                    fee = 900;
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            if(isStudentOrSenior == 1){
                fee = fee - (fee / 10);
            }
            totalAmount += fee;
            System.out.println("Membership in " + plans[choice - 1] + " plan booked. Fee: " + fee); 
            System.out.println("Total amount so far: " + totalAmount);
            System.out.println("Do you want to book another membership? (1-Yes / 0-No)");
            int moreBooking = sc.nextInt();
            if(moreBooking == 0){
                continueBooking = false;
            }     
        }
        
    }
}
