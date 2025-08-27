import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;

        while (moreCustomers) {
            int total = 0;

            System.out.println("\nWelcome to Online Shopping!");

            int items;
            do {
                System.out.print("Enter number of items you want to buy (at least 1): ");
                items = sc.nextInt();
            } while (items < 1);

            for (int i = 1; i <= items; i++) {
                System.out.println("\nChoose product " + i + ":");
                System.out.println("1. Mobile (15000 rs.)");
                System.out.println("2. Laptop (40000 rs.)");
                System.out.println("3. Headphones (2000 rs.)");
                System.out.println("4. Watch (5000 rs.)");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: total += 15000; break;
                    case 2: total += 40000; break;
                    case 3: total += 2000; break;
                    case 4: total += 5000; break;
                    default: System.out.println("Invalid choice! No item added.");
                }
            }

            if (total > 5000) {
                System.out.println("\nCongratulations! You get a 10% discount.");
                total = (int)(total * 0.9);
            }

            System.out.println("Final Bill Amount = rupees " + total);

            System.out.print("\nIs there another customer? (yes/no): ");
            String ans = sc.next();
            if (!ans.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }

        System.out.println("\nThank you for shopping with us!");
        sc.close();
    }
}