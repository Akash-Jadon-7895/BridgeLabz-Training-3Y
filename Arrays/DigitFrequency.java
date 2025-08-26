import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        String numStr = Long.toString(num);
        int n = numStr.length();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}
