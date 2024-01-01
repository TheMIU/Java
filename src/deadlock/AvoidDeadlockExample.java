package deadlock;

class AvoidDeadlockExample {
    private static final Object LOCK1 = new Object();
    private static final Object LOCK2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (LOCK1) {
                System.out.println("Thread 1: Holding LOCK1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                System.out.println("Thread 1: Waiting for LOCK2...");
                synchronized (LOCK2) {
                    System.out.println("Thread 1: Acquired LOCK2!");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (LOCK1) { // Locks acquired in the same order
                System.out.println("Thread 2: Holding LOCK1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                System.out.println("Thread 2: Waiting for LOCK2...");
                synchronized (LOCK2) {
                    System.out.println("Thread 2: Acquired LOCK2!");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
