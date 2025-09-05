package Learning2024.Utility;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private static ThreadPool instance;
    private ExecutorService executor;

    // Private constructor to prevent instantiation
    private ThreadPool() {
        int numberOfThreads = ConfigManager.getInstance().getProperty("threadCount") != null ?
                Integer.parseInt(ConfigManager.getInstance().getProperty("threadCount")) : Runtime.getRuntime().availableProcessors();
        executor = Executors.newFixedThreadPool(numberOfThreads);
    }

    // Public method to provide access to the instance
    public static ThreadPool getInstance() {
        if (instance == null) {
            synchronized (ThreadPool.class) {
                if (instance == null) {
                    instance = new ThreadPool();
                }
            }
        }
        return instance;
    }

    // Method to submit tasks to the thread pool
    public void submit(Runnable task) {
        executor.submit(task);
    }

    // Method to shut down the thread pool
    public void shutdown() {
        executor.shutdown();
    }
}
