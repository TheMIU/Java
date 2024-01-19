package copy_objects;

class CopyMethod {
    public static void main(String[] args) {
        DemoClass originalObj = new DemoClass(42);
        DemoClass copiedObj = originalObj.copy();

        copiedObj.testMethod();
        // Test method invoked
        // Data: 42
    }
}

class DemoClass {
    private int data;

    public DemoClass(int data) {
        this.data = data;
    }

    // Custom copy method
    public DemoClass copy() {
        return new DemoClass(this.data);
    }

    void testMethod() {
        System.out.println("Test method invoked");
        System.out.println("Data: " + data);
    }
}
