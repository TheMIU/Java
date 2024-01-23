package threads.executor_executorService_scheduledExecutorService;

import java.util.concurrent.Executor;

public class SimpleExecutorExample {
    public static void main(String[] args) {
        Executor executor = Runnable::run; // Default executor that runs tasks in the calling thread

        executor.execute(() -> {
            System.out.println("Task executed by Executor");
        });
    }
}
