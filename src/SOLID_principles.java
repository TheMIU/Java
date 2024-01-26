// Common interface for shapes
interface Shape {
    double calculateArea();
}

// Single Responsibility Principle (SRP)
// Good design following SRP
class Rectangle implements Shape{
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // This method adheres to SRP, handling only the calculation of the area for rectangles.
    public double calculateArea() {
        return width * height;
    }
}

class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // This method adheres to SRP, handling only the calculation of the area for circles.
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Open/Closed Principle (OCP)
// Good design following OCP
class AreaCalculator {
    // This method adheres to OCP by relying on the common interface (calculateArea) in each shape class.
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

// Liskov Substitution Principle (LSP)
// In this example, LSP is implicitly followed by having a common interface (calculateArea) in each shape class.

// Interface Segregation Principle (ISP)
// In this example, ISP is implicitly followed, as each class provides only the methods relevant to its responsibilities.

// Dependency Inversion Principle (DIP)
// DIP is implicitly followed in the design. High-level modules (AreaCalculator) depend on abstractions (Shape's calculateArea method).

// Example usage
public class SOLID_principles {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        AreaCalculator calculator = new AreaCalculator();

        // Using the good design
        System.out.println(calculator.calculateArea(rectangle));  // Output: 50.0
        System.out.println(calculator.calculateArea(circle));     // Output: 153.86
    }
}
