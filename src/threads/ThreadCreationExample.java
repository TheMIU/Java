package threads;

// two ways to create a thread

// 1. Extend Thread class
class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("inside thread 1");
    }
}

// 2. Implement Runnable Interface
class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("inside thread 2");
    }
}

class ThreadCreationExample {
    public static void main(String[] args) {
        // Extend Thread class
        Thread1 thread1 = new Thread1();
        thread1.start();

        // Implement Runnable Interface
        Thread thread2 = new Thread(new Thread2());
        thread2.start();
    }
}