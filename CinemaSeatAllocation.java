import java.util.Scanner;

public class CinemaSeatAllocation {
    public static void main(String[] args) {
        boolean[][] seats = new boolean[5][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Cinema Seat Allocation System");
        Boolean exit = false;   
        while(!exit){
            System.out.println("Is it a family booking? (yes - 1/no - 0)");
            int choice = sc.nextInt();
            sc.nextLine();  
            if(choice == 1) {
                System.out.println("Enter number of seats to book (max 3):");
                int numSeats = sc.nextInt();
                sc.nextLine();
                if(numSeats < 1 || numSeats > 3) {
                    System.out.println("Invalid number of seats. Please try again.");
                    continue;
                }
                boolean booked = false;
                for(int i = 0; i < seats.length; i++) {
                    for(int j = 0; j <= seats[i].length - numSeats; j++) {
                        boolean canBook = true;
                        for(int k = 0; k < numSeats; k++) {
                            if(seats[i][j + k]) {
                                canBook = false;
                                break;
                            }
                        }
                        if(canBook) {
                            for(int k = 0; k < numSeats; k++) {
                                seats[i][j + k] = true;
                            }
                            System.out.println("Successfully booked " + numSeats + " seats at row " + (i + 1) + ", starting from seat " + (j + 1));
                            booked = true;
                            break;
                        }
                    }
                    if(booked) {
                        break;
                    }
                }
                if(!booked) {
                    System.out.println("Sorry, no contiguous seats available for your booking.");
                }
            } else {
                System.out.println("Enter seat row (1-5):");
                int row = sc.nextInt() - 1;
                System.out.println("Enter seat number (1-10):");
                int seatNum = sc.nextInt() - 1;
                sc.nextLine();
                if(row < 0 || row >= seats.length || seatNum < 0 || seatNum >= seats[0].length) {
                    System.out.println("Invalid seat selection. Please try again.");
                    continue;
                }
                if(seats[row][seatNum]) {
                    System.out.println("Seat already booked. Please choose another seat.");
                } else {
                    seats[row][seatNum] = true;
                    System.out.println("Successfully booked seat at row " + (row + 1) + ", seat " + (seatNum + 1));
                }
            }
            System.out.println("Do you want to make another booking? (yes - 1/no - 0)");
            int cont = sc.nextInt();    
            sc.nextLine();
            if(cont == 0) {
                exit = true;
                System.out.println("Exiting the Cinema Seat Allocation System. Thank you!");
    
        }
    }}
}
