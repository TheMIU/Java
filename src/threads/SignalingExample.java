package threads;

class SharedObject {
    public synchronized void waitForSignal() {
        try {
            // Wait for a signal/notification
            wait();
            System.out.println("Received a signal");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void notifyThread() {
        // Notify a waiting thread
        notify();
    }

    public synchronized void notifyAllThreads() {
        // Notify all waiting threads
        notifyAll();
    }
}

public class SignalingExample {
    public static void main(String[] args) {
        final SharedObject sharedObj = new SharedObject();

        Thread waitingThread = new Thread(() -> {
            sharedObj.waitForSignal(); // Waiting for a signal/notification
        });

        Thread notifyingThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulating some task
                sharedObj.notifyThread(); // Notifying the waiting thread
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread notifyingAllThread = new Thread(() -> {
            try {
                Thread.sleep(3000); // Simulating some task
                sharedObj.notifyAllThreads(); // Notifying all waiting threads
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        waitingThread.start();
        notifyingThread.start();
        notifyingAllThread.start();
    }
}

/*
   Explanation:

 * SharedObject class has methods waitForSignal(), notifyThread(), and
   notifyAllThreads(), all synchronized to demonstrate signaling between
   threads.
 * waitForSignal() method makes the thread wait until notified using wait().
 * notifyThread() method notifies one waiting thread using notify().
 * notifyAllThreads() method notifies all waiting threads using notifyAll().
   
   In this example, different threads are waiting, and other threads notify them
   to continue their execution. This illustrates how wait(), notify(), and
   notifyAll() facilitate communication between threads, allowing them to
   coordinate their actions effectively in a synchronized manner.
 */