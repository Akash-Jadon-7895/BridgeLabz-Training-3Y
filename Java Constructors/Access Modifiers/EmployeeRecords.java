import java.util.*;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String team;

    Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Team: " + team);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String dept = sc.nextLine();
        double salary = sc.nextDouble();
        sc.nextLine();
        String team = sc.nextLine();
        Manager m = new Manager(id, dept, salary, team);
        m.displayManagerDetails();
        double newSalary = sc.nextDouble();
        m.setSalary(newSalary);
        m.displayManagerDetails();
    }
}
