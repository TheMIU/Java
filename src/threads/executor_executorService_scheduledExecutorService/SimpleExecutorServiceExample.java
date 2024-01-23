package threads.executor_executorService_scheduledExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleExecutorServiceExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Task completed";
        });

        System.out.println("Task submitted");

        // Blocks until the result is available
        String result = future.get();
        System.out.println(result);

        // Shutdown the executor service
        executorService.shutdown();
    }
}
