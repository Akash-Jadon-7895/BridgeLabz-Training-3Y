public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        int[] scores = {45, 67, 23, 89, 34, 56, 78, 90, 12, 34};
        int totalScore = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;

        for (int score : scores) {
            totalScore += score;
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
        }

        double averageScore = (double) totalScore / scores.length;

        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
    }
}
