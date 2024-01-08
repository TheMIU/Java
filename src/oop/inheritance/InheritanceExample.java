package oop.inheritance;

// Parent class
class Vehicle {
    protected String brand;

    public void drive() {
        System.out.println("The vehicle is moving.");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Number of doors: " + numberOfDoors);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        myCar.displayDetails();
        myCar.drive(); // Accessing the drive method from the Vehicle class
    }
}
