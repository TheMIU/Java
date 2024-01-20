package oop.abstraction;

// Abstract class representing a Shape
abstract class Shape {
    // Abstract method to draw the shape
    abstract void draw();
}

// Concrete class representing a Circle
class Circle extends Shape {
    // Implementation of the draw method for a Circle
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete class representing a Square
class Square extends Shape {
    // Implementation of the draw method for a Square
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle = new Circle();
        Square square = new Square();

        // Using the abstraction to draw shapes
        circle.draw();
        square.draw();
    }
}