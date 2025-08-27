import java.util.*;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90); // 0 to 89, random 2-digit or less
        }
        return ages;
    }
    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }
    public static void displayTable(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = generateAges(n);
        String[][] table = checkVoting(ages);
        displayTable(table);
    }
}
