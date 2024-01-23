package threads.synchronized_vs_reentrantLock;

public class SynchronizedCounter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        // The synchronized keyword ensures that only one thread can execute this method at a time
        count++;
        System.out.println(Thread.currentThread().getName() + ": Incremented count to " + count);
    }

    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();

        // Create multiple threads to increment the counter
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (int j = 0; j < 3; j++) {
                    counter.increment();
                }
            }).start();
        }
    }
}
