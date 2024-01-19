package static_import;

import static static_import.MathOperations.add; // Importing the static method
import static static_import.MathOperations.PI; // Importing the static field

public class DemoClass {
    public static void main(String[] args) {
        // Using the static method directly
        int result = add(5, 3);
        System.out.println("Result: " + result);

        // Using the static field directly
        System.out.println("Value of PI: " + PI);

        // before we called like this, using class name
        System.out.println("Value of PI: " + MathOperations.PI); // that gives the same result
    }
}
