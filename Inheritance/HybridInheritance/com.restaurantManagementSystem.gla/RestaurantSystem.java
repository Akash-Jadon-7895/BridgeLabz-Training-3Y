package com.restaurantManagementSystem.gla;
public class RestaurantSystem {
     public static void main(String[] args) {
        Worker chef = new Chef("Alice", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Bob", 202, 5);
        chef.performDuties();
        System.out.println("-------------------");
        waiter.performDuties();
    }
}