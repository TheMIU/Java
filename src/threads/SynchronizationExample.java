package threads;

class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Incrementing the count
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        IncrementThread thread1 = new IncrementThread(counter);
        IncrementThread thread2 = new IncrementThread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}

/**
   Synchronization in Java refers to the coordination mechanism used to 
   control access to shared resources or critical sections of code 
   in a multithreaded environment. It ensures that only one thread at a time 
   can access the synchronized block of code or method, preventing 
   data corruption and maintaining consistency when multiple threads are 
   concurrently accessing shared resources. 

 In this example:
  
 * Counter is a shared resource with an increment() method that increments the
   count variable in a synchronized manner.
 * IncrementThread is a thread class that increments the count of the Counter
   object in a loop.
 * In main(), two threads (thread1 and thread2) are created, both incrementing
   the Counter object concurrently.
 * With synchronization (synchronized method in Counter), the final count should
   ideally be 2000 (1000 increments from each thread).

 This synchronization ensures that only one thread can execute the increment()
 method at a time, preventing race conditions and leading to the correct final
 count value of 2000.

 ====
 thread1.join(); and thread2.join(); are called after starting thread1 and thread2 using start() method.
 These calls make the main thread (the thread executing main()) wait for thread1 and thread2 to
 finish their execution before proceeding further.
 */