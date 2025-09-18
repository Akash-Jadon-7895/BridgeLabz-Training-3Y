import java.util.*;

class Employee {
    static String companyName = "Default Company";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee.companyName = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String designation = sc.nextLine();
            Employee e = new Employee(id, name, designation);
            e.displayDetails();
        }
        Employee.displayTotalEmployees();
    }
}