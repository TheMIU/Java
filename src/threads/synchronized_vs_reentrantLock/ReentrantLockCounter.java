package threads.synchronized_vs_reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockCounter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    // Method using ReentrantLock to increment the counter
    public void increment() {
        lock.lock(); // Acquire the lock
        try {
            // Critical section
            count++;
            System.out.println(Thread.currentThread().getName() + ": Incremented count to " + count);
        } finally {
            lock.unlock(); // Release the lock in a finally block to ensure it is released even if an
                           // exception occurs
        }
    }

    public static void main(String[] args) {
        ReentrantLockCounter counter = new ReentrantLockCounter();

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

/*
 * Choose between synchronized and ReentrantLock based on your specific
 * requirements. ReentrantLock offers more advanced features, such as
 * interruptible locks and conditions, but it comes with additional complexity.
 * For simpler scenarios, synchronized is often more concise and readable.
 */