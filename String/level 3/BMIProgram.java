import java.util.*;

public class BMIProgram {
    public static double[][] takeInput(int n) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextDouble(); // weight in kg
            arr[i][1] = sc.nextDouble(); // height in cm
        }
        return arr;
    }

    public static String[] findBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;
        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";
        return new String[]{String.valueOf(bmi), status};
    }

    public static String[][] calculateBMI(double[][] arr) {
        String[][] result = new String[arr.length][4];
        for (int i = 0; i < arr.length; i++) {
            String[] bmiStatus = findBMIStatus(arr[i][0], arr[i][1]);
            result[i][0] = String.valueOf(arr[i][0]); // weight
            result[i][1] = String.valueOf(arr[i][1]); // height
            result[i][2] = bmiStatus[0]; // bmi
            result[i][3] = bmiStatus[1]; // status
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1] + "\t\t" + arr[i][2] + "\t\t" + arr[i][3]);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        double[][] input = takeInput(n);
        String[][] result = calculateBMI(input);
        display(result);
    }
}
