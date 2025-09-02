import java.util.*;

public class EmployeeBonus {
    public static int[][] generateSalaryAndService(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            int salary = 10000 + (int)(Math.random() * 90000);
            int years = 1 + (int)(Math.random() * 10);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }
    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }
    public static void displaySummary(int[][] data, double[][] updated) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.printf("%-10s %-10s %-12s %-12s %-12s%n", "EmpID", "Salary", "YearsService", "NewSalary", "Bonus");
        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double newSalary = updated[i][0];
            double bonus = updated[i][1];
            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;
            System.out.printf("%-10d %-10d %-12d %-12.2f %-12.2f%n", (i + 1), oldSalary, years, newSalary, bonus);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-12s %-12.2f %-12.2f%n", "Total", totalOld, "", totalNew, totalBonus);
    }
    public static void main(String[] args) {
        int[][] salaryService = generateSalaryAndService(10);
        double[][] newSalaryBonus = calculateNewSalaryAndBonus(salaryService);
        displaySummary(salaryService, newSalaryBonus);
    }
}
