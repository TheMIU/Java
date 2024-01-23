package threads.thread_safe_singleton;

public class Demo {
    public static void main(String[] args) {
        // 1. Double-Checked Locking (Lazy Initialization)
        testDoubleCheckedLocking();

        // 2. Bill Pugh Singleton Pattern (Initialization-on-demand holder idiom)
        testBillPughSingleton();
    }

    private static void testDoubleCheckedLocking() {
        System.out.println("Testing Double-Checked Locking:");

        // Creating multiple threads to get instances concurrently
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                ThreadSafeSingleton1 instance = ThreadSafeSingleton1.getInstance();
                System.out.println("Thread " + Thread.currentThread().getId() + ": " + instance.hashCode());
            }).start();
        }
    }

    private static void testBillPughSingleton() {
        System.out.println("\nTesting Bill Pugh Singleton Pattern:");

        // Creating multiple threads to get instances concurrently
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                ThreadSafeSingleton2 instance = ThreadSafeSingleton2.getInstance();
                System.out.println("Thread " + Thread.currentThread().getId() + ": " + instance.hashCode());
            }).start();
        }
    }
}