import java.util.*;

class Student {
    static String universityName = "Default University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student.universityName = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int roll = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String grade = sc.nextLine();
            students[i] = new Student(roll, name, grade);
            students[i].displayDetails();
        }
        int updateIndex = sc.nextInt();
        sc.nextLine();
        String newGrade = sc.nextLine();
        if (updateIndex >= 0 && updateIndex < n) {
            students[updateIndex].updateGrade(newGrade);
            students[updateIndex].displayDetails();
        }
        Student.displayTotalStudents();
    }
}