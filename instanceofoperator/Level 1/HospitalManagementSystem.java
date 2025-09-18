import java.util.*;

class Patient {
    static String hospitalName = "Default Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient.hospitalName = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            String ailment = sc.nextLine();
            Patient p = new Patient(id, name, age, ailment);
            p.displayDetails();
        }
        Patient.getTotalPatients();
    }
}