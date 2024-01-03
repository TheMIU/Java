package inner_class;

class OuterClass {
    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Static nested class method");
        }
    }
    
    public static void main(String[] args) {
        // Accessing static nested class
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display(); // Output: Static nested class method
    }
}
