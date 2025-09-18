import java.util.Scanner;
public class youngestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = sc.nextDouble();
        String youngest;
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            youngest = "Akbar";
        } else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            youngest = "Anthony";
        } else {
            youngest = "There is a tie in ages.";
        }
        String tallest;
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            tallest = "Akbar";
        } else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            tallest = "Anthony";
        } else {
            tallest = "There is a tie in heights.";
        }
        System.out.println("Youngest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);
    }
}