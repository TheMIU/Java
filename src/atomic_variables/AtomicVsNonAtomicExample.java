package atomic_variables;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVsNonAtomicExample {
    private static int nonAtomicCounter = 0;
    private static AtomicInteger atomicCounter = new AtomicInteger(0);

    public static void main(String[] args) {
        // Non-atomic counter example
        Runnable nonAtomicTask = () -> {
            for (int i = 0; i < 10000; i++) {
                nonAtomicCounter++;
            }
        };

        // Atomic counter example
        Runnable atomicTask = () -> {
            for (int i = 0; i < 10000; i++) {
                atomicCounter.incrementAndGet();
            }
        };

        // Creating threads
        Thread nonAtomicThread1 = new Thread(nonAtomicTask);
        Thread nonAtomicThread2 = new Thread(nonAtomicTask);
        Thread atomicThread = new Thread(atomicTask);

        // Starting threads
        nonAtomicThread1.start();
        nonAtomicThread2.start();
        atomicThread.start();

        // Waiting for threads to finish
        try {
            nonAtomicThread1.join();
            nonAtomicThread2.join();
            atomicThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Results
        System.out.println("Non-Atomic Counter Result: " + nonAtomicCounter);
        System.out.println("Atomic Counter Result: " + atomicCounter.get());
    }
}

/*
 * Atomic variables in Java ensure thread-safe, uninterruptible operations on
 * shared variables without explicit synchronization, reducing the risk of race
 * conditions in concurrent programming.
 * 
 * 1. **Non-Atomic Counter (`nonAtomicCounter`):**
 * - **Issue:** Two non-atomic threads (`nonAtomicThread1` and
 * `nonAtomicThread2`) are concurrently incrementing the `nonAtomicCounter`
 * without proper synchronization.
 * - **Result:** Due to the lack of synchronization, multiple threads are
 * modifying the shared variable simultaneously, leading to a race condition.
 * - **Output:** The final value of `nonAtomicCounter` may vary between runs and
 * is likely to be less than the expected total of `20000`. In this specific
 * run, the result is changing value.
 * 
 * 2. **Atomic Counter (`atomicCounter`):**
 * - **Solution:** The `atomicCounter` uses `AtomicInteger`, and its
 * `incrementAndGet()` operation is inherently atomic, ensuring thread safety
 * without the need for explicit synchronization.
 * - **Result:** The atomic counter reliably increments to the expected total of
 * `20000`.
 * - **Output:** The final value of `atomicCounter` is `10000`, as expected.
 * 
 * In summary, the non-atomic counter demonstrates the issue of race conditions
 * in a multithreaded environment when shared variables are modified without
 * proper synchronization. The atomic counter, on the other hand, avoids these
 * issues by using atomic operations, ensuring consistent and correct results in
 * a concurrent setting.
 */