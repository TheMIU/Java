package string_api;

public class SynchronizationExample {
    private static StringBuilder sharedBuilder = new StringBuilder();
    private static StringBuffer sharedBuffer = new StringBuffer();

    public static void main(String[] args) {
        Runnable builderRunnable = () -> {
            for (int i = 0; i < 5; i++) {
                sharedBuilder.append(Thread.currentThread().getName()).append(" - "); // Unsafe operation
                System.out.println(Thread.currentThread().getName() + " modified StringBuilder");
            }
        };

        Runnable bufferRunnable = () -> {
            synchronized (sharedBuffer) {
                for (int i = 0; i < 5; i++) {
                    sharedBuffer.append(Thread.currentThread().getName()).append(" - "); // Safe operation
                    System.out.println(Thread.currentThread().getName() + " modified StringBuffer");
                }
            }
        };

        Thread builderThread1 = new Thread(builderRunnable);
        Thread builderThread2 = new Thread(builderRunnable);
        Thread bufferThread1 = new Thread(bufferRunnable);
        Thread bufferThread2 = new Thread(bufferRunnable);

        builderThread1.start();
        builderThread2.start();
        bufferThread1.start();
        bufferThread2.start();
    }
}

/*
   output (changing)
    Thread-2 modified StringBuffer
    Thread-0 modified StringBuilder
    Thread-1 modified StringBuilder
    Thread-1 modified StringBuilder
    Thread-2 modified StringBuffer
    Thread-0 modified StringBuilder
    Thread-1 modified StringBuilder
    Thread-1 modified StringBuilder
    Thread-2 modified StringBuffer
    Thread-0 modified StringBuilder
    Thread-1 modified StringBuilder
    Thread-2 modified StringBuffer
    Thread-0 modified StringBuilder
    Thread-0 modified StringBuilder
    Thread-2 modified StringBuffer
    Thread-3 modified StringBuffer
    Thread-3 modified StringBuffer
    Thread-3 modified StringBuffer
    Thread-3 modified StringBuffer
    Thread-3 modified StringBuffer

   In the given scenario:
 
 * StringBuilder is accessed by Thread-0 and Thread-1 without a defined order,
   resulting in concurrent and potentially interleaved modifications.
   (thread 0, 1 මාරුවෙන් මාරුවට)

 * StringBuffer is accessed by Thread-2 and Thread-3, and due to
   synchronization, modifications occur sequentially, ensuring a clear and
   ordered execution. 
   (thread 2 වලට පස්සෙ thread 3)
 
 */
