import java.util.*;

public class StudentGrades {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // random 2-digit, between 60 and 100
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double percent = Math.round((total / 300.0 * 100) * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];
            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void display(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] +
                    "\t" + (int)results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        display(scores, results, grades);
    }
}
