package string_api;

public class ThreadSafetyExample {
    private static String sharedString = "Initial Value";
    private static StringBuilder sharedBuilder = new StringBuilder("Initial Value");
    private static StringBuffer sharedBuffer = new StringBuffer("Initial Value");

    public static void main(String[] args) {
        Runnable stringRunnable = () -> {
            System.out.println(Thread.currentThread().getName() + " sees String: " + sharedString);
        };

        Runnable builderRunnable = () -> {
            sharedBuilder.append(" - Modified by " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " sees StringBuilder: " + sharedBuilder);
        };

        Runnable bufferRunnable = () -> {
            synchronized (sharedBuffer) {
                sharedBuffer.append(" - Modified by " + Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() + " sees StringBuffer: " + sharedBuffer);
            }
        };

        Thread stringThread1 = new Thread(stringRunnable);
        Thread stringThread2 = new Thread(stringRunnable);
        Thread builderThread1 = new Thread(builderRunnable);
        Thread builderThread2 = new Thread(builderRunnable);
        Thread bufferThread1 = new Thread(bufferRunnable);
        Thread bufferThread2 = new Thread(bufferRunnable);

        stringThread1.start();
        stringThread2.start();
        builderThread1.start();
        builderThread2.start();
        bufferThread1.start();
        bufferThread2.start();
    }
}
