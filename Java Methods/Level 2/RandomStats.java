import java.util.*;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(1000 + Math.random() * 9000);
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.print("Generated numbers: ");
        for (int n : randomNumbers) System.out.print(n + " ");
        System.out.println();
        double[] result = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
