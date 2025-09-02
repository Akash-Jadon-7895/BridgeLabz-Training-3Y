import java.util.*;

public class NumberChecker5 {
    public static int sumOfProperDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return n == 1 ? 0 : sum;
    }
    public static boolean isPerfect(int n) {
        return sumOfProperDivisors(n) == n;
    }
    public static boolean isAbundant(int n) {
        return sumOfProperDivisors(n) > n;
    }
    public static boolean isDeficient(int n) {
        return sumOfProperDivisors(n) < n;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Perfect Number: " + isPerfect(number));
        System.out.println("Abundant Number: " + isAbundant(number));
        System.out.println("Deficient Number: " + isDeficient(number));
        System.out.println("Strong Number: " + isStrong(number));
    }
}
