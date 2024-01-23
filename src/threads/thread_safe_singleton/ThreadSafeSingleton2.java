package threads.thread_safe_singleton;

// 2. Bill Pugh Singleton Pattern (Initialization-on-demand holder idiom)

public class ThreadSafeSingleton2 {
    private ThreadSafeSingleton2() {
        // private constructor to prevent instantiation
    }

    private static class SingletonHelper {
        private static final ThreadSafeSingleton2 INSTANCE = new ThreadSafeSingleton2();
    }

    public static ThreadSafeSingleton2 getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
