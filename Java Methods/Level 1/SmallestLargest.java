import java.util.*;

public class SmallestLargest {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = n1;
        int largest = n1;
        if (n2 < smallest) smallest = n2;
        if (n3 < smallest) smallest = n3;
        if (n2 > largest) largest = n2;
        if (n3 > largest) largest = n3;
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] result = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest: " + result[0] + " Largest: " + result[1]);
    }
}
