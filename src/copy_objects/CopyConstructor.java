package copy_objects;

class CopyConstructor {
    public static void main(String[] args) {
        MyClass originalObj = new MyClass(10);
        MyClass copiedObj = new MyClass(originalObj);

        copiedObj.testMethod();
        // Test method invoked
        // Data : 10
    }
}

class MyClass {
    int data;

    MyClass(int data) {
        this.data = data;
    }

    MyClass(MyClass original) {
        // Create a new instance and set its data field
        this.data = original.data;
    }

    void testMethod() {
        System.out.println("Test method invoked");
        System.out.println("Data : " + data);
    }
}