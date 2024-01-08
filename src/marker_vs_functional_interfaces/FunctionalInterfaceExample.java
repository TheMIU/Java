package marker_vs_functional_interfaces;

// Functional Interface
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); // Single abstract method
    
    // Additional default or static methods are allowed in a Functional Interface
    default void printResult(int result) {
        System.out.println("Result: " + result);
    }
}

class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        Calculator addition = (a, b) -> a + b;
        
        int result = addition.calculate(5, 3);
        addition.printResult(result); // Using default method from the interface to print result
        //...
    }
}

