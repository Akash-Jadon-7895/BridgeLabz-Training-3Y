package com.vehicleTransportSystem.gla;
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 10),
            new Motorcycle(150, "Petrol", true)
        };
        for (Vehicle v : vehicles) {
            v.displayInfo(); // Polymorphism
            System.out.println("-------------------");
        }
    }
}