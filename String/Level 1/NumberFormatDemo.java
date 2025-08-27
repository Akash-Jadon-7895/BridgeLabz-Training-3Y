import java.util.*;

public class NumberFormatDemo {
    static void generate(String text) {
        int n = Integer.parseInt(text);
        System.out.println(n);
    }
    static void handle(String text) {
        try {
            int n = Integer.parseInt(text);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Handled: NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("Handled: RuntimeException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        handle(input);
    }
}
