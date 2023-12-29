/* package threads;

class SharedObject {
    public synchronized void waitForSignal() {
        try {
            // Wait for a signal/notification
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void notifyThread() {
        // Notify waiting threads
        notify(); // or notifyAll() for multiple waiting threads
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        final SharedObject sharedObj = new SharedObject();

        Thread waitingThread = new Thread(() -> {
            sharedObj.waitForSignal(); // Waiting for a signal/notification
            System.out.println("Thread received signal");
        });

        Thread notifyingThread = new Thread(() -> {
            // Performing some task...
            sharedObj.notifyThread(); // Notifying the waiting thread
        });

        waitingThread.start();
        notifyingThread.start();
    }
}

/*

   In this example:
 
 * The waitForSignal() method waits for a notification using wait().
 * The notifyThread() method sends a notification using notify() to wake up the
   waiting thread.
 * These methods (wait(), notify(), notifyAll()) are essential for coordinating
   and synchronizing actions between threads in Java, facilitating safe and
   efficient inter-thread communication.

 */ 