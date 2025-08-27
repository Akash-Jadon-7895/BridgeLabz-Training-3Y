import java.util.Scanner;

public class RailwayReservationSystem {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Railway Reservation System");
        System.out.println("Available Trains: 1. Express 2. SuperFast 3. Rajdhani");
        System.out.println("fare: Express-500, SuperFast-800, Rajdhani-1000");
        String[] trains = {"Express", "SuperFast", "Rajdhani"};
        
        int[] capacity = {3, 2, 2};
        int[] booked = {0, 0, 0};
        int choice, n;

        do {
            System.out.println("Available Trains:");
            for (int i = 0; i < trains.length; i++) {
                if(capacity[i] - booked[i] > 0) {
                    System.out.println((i + 1) + ". " + trains[i] + " (Seats available: " + (capacity[i] - booked[i]) + ")");
                } else {
                    System.out.println((i + 1) + ". " + trains[i] + " (No seats available, only waiting list)");
                }
            }
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter number of passengers: ");
                n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (booked[choice - 1] < capacity[choice - 1]) {
                        booked[choice - 1]++;
                        System.out.println("Seat confirmed in " + trains[choice - 1]);
                    } else {
                        System.out.println("Waiting list in " + trains[choice - 1]);
                    }
                }
            } else {
                System.out.println("Invalid choice");
            }

            System.out.println("Book more? (1-Yes / 0-No)");
        } while (sc.nextInt() == 1);
    }
}
