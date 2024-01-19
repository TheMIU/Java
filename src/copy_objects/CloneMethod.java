package copy_objects;

class CloneMethodExample implements Cloneable {
    int data;

    public CloneMethodExample(int data) {
        this.data = data;
    }

    // Override the clone method to provide a shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void testMethod() {
        System.out.println("Test method invoked");
        System.out.println("Data: " + data);
    }
}

class Demo {
    public static void main(String[] args) {
        try {
            CloneMethodExample originalObj = new CloneMethodExample(20);
            CloneMethodExample clonedObj = (CloneMethodExample) originalObj.clone();

            clonedObj.testMethod();
            // Test method invoked
            // Data: 20
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}