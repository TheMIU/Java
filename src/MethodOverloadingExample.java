public class MethodOverloadingExample {
    public static void main(String[] args) {
        // Method overloading in Java refers to the ability to define multiple methods
        // with the same name in the same class
        // but with different parameter count or type.

        // same name - different parameter count
        test(); // test() invoked
        test(1); // test(int x) invoked
        test(1, 2); // test(int x, int y) invoked
        
        // same name - different parameter type
        test("Hi", 0.5); // test(String x, double y) invoked
    }

    static void test() {
        System.out.println("test() invoked");
    }

    static void test(int x) {
        System.out.println("test(int x) invoked");
    }

    static void test(int x, int y) {
        System.out.println("test(int x, int y) invoked");
    }

    static void test(String x, double y) {
        System.out.println("test(String x, double y) invoked");
    }
}


/*
 * Method overloading
 * 
 * එකම class එකක් ඇතුලෙ
 * same name - different parameter count
 * same name - different parameter type
 * method හදන්න පුලුවන්.
 * 
 */