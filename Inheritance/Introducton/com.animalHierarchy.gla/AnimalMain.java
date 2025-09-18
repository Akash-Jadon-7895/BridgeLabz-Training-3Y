package com.animalHierarchy.gla;
public class AnimalMain {
    public static void main(String[] args) {
        
        Animal[] animals = {
            new Dog("Bruno", 5),
            new Cat("Kitty", 3),
            new Bird("Mittu", 2)
        };

        for (Animal a : animals) {
            a.makeSound(); // Polymorphism
        }
    }
}