package inner_class;

class OuterClass {
    void outerMethod() {
        // Local class inside a method
        class LocalClass {
            void display() {
                System.out.println("Local class method");
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.display(); // Output: Local class method
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.outerMethod();
    }
}
