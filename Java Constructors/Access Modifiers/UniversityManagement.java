import java.util.*;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double cgpa = sc.nextDouble();
        sc.nextLine();
        String specialization = sc.nextLine();
        PostgraduateStudent pg = new PostgraduateStudent(roll, name, cgpa, specialization);
        pg.displayPGDetails();
        double newCgpa = sc.nextDouble();
        pg.setCGPA(newCgpa);
        pg.displayPGDetails();
    }
}
