import java.util.*;

public class ArrayDemo {
    static void generate(String[] arr) {
        System.out.println(arr[arr.length]);
    }
    static void handle(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled: ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Handled: RuntimeException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        handle(names);
    }
}

