package threads.executor_executorService_scheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SimpleScheduledExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        // Schedule a task to be executed after a delay
        scheduledExecutorService.schedule(() -> {
            System.out.println("Delayed task executed");
        }, 2, TimeUnit.SECONDS);

        // Schedule a task to be executed periodically with a fixed rate
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Repeated task executed");
        }, 0, 1, TimeUnit.SECONDS);

        // Sleep for a while to allow scheduled tasks to run
        Thread.sleep(5000);

        // Shutdown the scheduled executor service
        scheduledExecutorService.shutdown();
    }
}
