package threads;

class MyThread extends Thread {
    public void run() {
        // Code to be executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Count " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadLifecycleExample {
    public static void main(String[] args) {
        // New state
        MyThread myThread = new MyThread();

        // Runnable state
        myThread.start();

        // Blocked state (simulating synchronization)
        synchronized (myThread) {
            try {
                myThread.wait(); // Waiting for notification
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Timed Waiting state
        Thread anotherThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        anotherThread.start();
        try {
            anotherThread.join(); // Wait for anotherThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Terminated state
        System.out.println("Main thread is done");
    }
}

