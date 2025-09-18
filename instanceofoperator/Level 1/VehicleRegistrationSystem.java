import java.util.*;

class Vehicle {
    static double registrationFee = 5000.0;
    final int registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(int registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double newFee = sc.nextDouble();
        sc.nextLine();
        Vehicle.updateRegistrationFee(newFee);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int regNo = sc.nextInt();
            sc.nextLine();
            String owner = sc.nextLine();
            String type = sc.nextLine();
            Vehicle v = new Vehicle(regNo, owner, type);
            v.displayDetails();
        }
    }
}