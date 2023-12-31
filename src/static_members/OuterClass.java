package static_members;

public class OuterClass {
    OuterClass() {
        System.out.println("I'm not invoking");
    }

    static class NestedStaticClass {
        static void sayHello() {
            System.out.println("Hello from Nested Static class");
        }
    }
}

// Inner Class vs Nested Static Class
// Inner Class <- declared without the static keyword
// Nested Static Class <- declared as static