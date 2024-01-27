public class ObjectLifeCycleExample {

    public static void main(String[] args) {
        // 1. Creation (Instantiation)
        MyClass obj = new MyClass();

        // 2. Initialization
        // Constructor is invoked during initialization
        // Fields are initialized, e.g., value = 0

        // 3. Usage
        int result = obj.calculateSomething();
        System.out.println(result);

        // 4. Reference Removal (Dereference)
        obj = null; // Object becomes a candidate for garbage collection

        // 5. Garbage Collection
        // Automated process by the JVM to reclaim memory

        // 6. Finalization (Optional)
        // If overridden, finalize() method may be called before garbage collection
    }

    static class MyClass {
        private int value;

        // Constructor for initialization
        public MyClass() {
            value = 0; // Initialization
        }

        // Method for usage
        public int calculateSomething() {
            // Perform some calculation
            return value + 42;
        }
    }
}
