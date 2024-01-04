package threads;

public class VolatileExample {

    static volatile int counter = 0; // change volatile to see difference

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            int localCounter = counter;

            while (localCounter < 5) {
                if (localCounter != counter) {
                    System.out.println("[T1] local counter changed.");
                    localCounter = counter;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            int localCounter = counter;

            while (localCounter < 5) {
                System.out.println("[T2] Incremented the counter to " + (localCounter + 1));
                counter = ++localCounter;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}

// Video: https://www.youtube.com/watch?v=V2hC-g6FoGc

// output without volatile keyword
/*
 * [T2] Incremented the counter to 1
 * [T2] Incremented the counter to 2
 * [T2] Incremented the counter to 3
 * [T2] Incremented the counter to 4
 * [T2] Incremented the counter to 5
 */

// output with volatile keyword
/*
 * [T2] Incremented the counter to 1
 * [T1] local counter changed.
 * [T2] Incremented the counter to 2
 * [T1] local counter changed.
 * [T2] Incremented the counter to 3
 * [T1] local counter changed.
 * [T2] Incremented the counter to 4
 * [T1] local counter changed.
 * [T2] Incremented the counter to 5
 * [T1] local counter changed.
 */