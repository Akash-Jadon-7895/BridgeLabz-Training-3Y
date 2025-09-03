import java.util.*;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double newFee = sc.nextDouble();
        sc.nextLine();
        Vehicle.updateRegistrationFee(newFee);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String owner = sc.nextLine();
            String type = sc.nextLine();
            Vehicle v = new Vehicle(owner, type);
            v.displayVehicleDetails();
        }
    }
}
