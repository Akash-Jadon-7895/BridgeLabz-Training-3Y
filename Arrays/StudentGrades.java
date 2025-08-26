import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int m;
                do {
                    if (j == 0) System.out.print("Enter Physics marks for student " + (i+1) + ": ");
                    else if (j == 1) System.out.print("Enter Chemistry marks for student " + (i+1) + ": ");
                    else System.out.print("Enter Math marks for student " + (i+1) + ": ");
                    m = sc.nextInt();
                    if (m < 0) System.out.println("Enter positive marks!");
                } while (m < 0);
                marks[i][j] = m;
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentage[i] >= 80) grade[i] = "A";
            else if (percentage[i] >= 70) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else if (percentage[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1));
            System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Math: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + "%, Grade: " + grade[i]);
            System.out.println();
        }
    }
}
