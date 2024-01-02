package default_method_in_interface;

// Defining an interface with a default method
interface MyInterface {
    // Abstract method (to be implemented by classes implementing this interface)
    void regularMethod();
    
    // Default method (provides a default implementation)
    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }
}

// Implementing the interface in a class
class MyClass implements MyInterface {
    // Implementing the abstract method from the interface
    public void regularMethod() {
        System.out.println("Implementing regularMethod in MyClass");
    }
    
    // MyClass can choose to override the defaultMethod if needed
    public void defaultMethod() {
        System.out.println("Overriding defaultMethod in MyClass");
    }
}

class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // Calling the implemented method
        obj.regularMethod(); // Output: Implementing regularMethod in MyClass
        
        // Calling the default method
        obj.defaultMethod(); // Output: Overriding defaultMethod in MyClass
    }
}
