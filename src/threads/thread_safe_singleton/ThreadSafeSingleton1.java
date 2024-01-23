package threads.thread_safe_singleton;

// 1. Double-Checked Locking (Lazy Initialization)

class ThreadSafeSingleton1 {
    private static volatile ThreadSafeSingleton1 instance;

    private ThreadSafeSingleton1() {
        // private constructor to prevent instantiation
    }

    public static ThreadSafeSingleton1 getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton1.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton1();
                }
            }
        }
        return instance;
    }
}
