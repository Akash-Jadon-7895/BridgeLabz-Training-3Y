import java.util.*;

public class SumNatural {
    public static int sumOfNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfNatural(n);
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
    }
}
