import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void salarySlip(String name, int salary) {
        System.out.println("Salary Slip for " + name);
        System.out.println("Basic Salary: " + salary);
        int hra = salary * 20 / 100;
        int da = salary * 10 / 100;
        int netSalary = salary + hra + da;
        if(netSalary > 50000) {
            System.out.println("You get a tax deduction of 10%");
            netSalary = netSalary * 90 / 100;
        }
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Net Salary: " + netSalary);
    }
    public static void main(String[] args) {
        String [] employees = new String[100];
        int [] salaries = new int[100];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 100; i++){
            System.out.println("Enter employee name");
            employees[i] = sc.nextLine();
            System.out.println("Enter employee salary");    
            salaries[i] = sc.nextInt();
            System.out.println("Do you want to add more employees? (yes - 1/no - 0)");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 0) {
                break;
            }
        }
        for(int i = 0; i < employees.length; i++) {
            if(employees[i] == null) {
                break;
            }
            salarySlip(employees[i], salaries[i]);
            System.out.println();
        }
    }
}
