import java.util.*;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            double bmi = calculateBMI(weight, height);
            members[i][0] = weight;
            members[i][1] = height;
            members[i][2] = bmi;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i + 1) + ": Weight = " + members[i][0] + " kg, Height = " + members[i][1] + " cm, BMI = " + members[i][2] + ", Status = " + getBMIStatus(members[i][2]));
        }
    }
}
