package com.restaurantManagementSystem.gla;
public class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass 1
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        displayDetails();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Cooking delicious meals.");
    }
}
// Subclass 2
class Waiter extends Person implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tableCount);
        System.out.println("Duties: Serving food and taking orders.");
    }
}