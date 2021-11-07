package study.threadtest.threadPool;

import org.junit.jupiter.api.Test;
import study.threadtest.utils.ThreadUtil;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static study.threadtest.utils.PrintUtil.print;
import static study.threadtest.utils.ThreadUtil.sleep;

public class ThreadPoolTest {

    @Test
    void test1() throws InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);
//        final ExecutorService executorService = Executors.newCachedThreadPool();

        ThreadPoolExecutor executor = (ThreadPoolExecutor) executorService;

        Runnable jobA = job("jobA", executor);

        executorService.execute(jobA);
//        executorService.execute(jobA);

        sleep(20000);
    }

    private Runnable job(String jobName, ThreadPoolExecutor executor) {
        Runnable job = () -> {
            for (int no = 1; no <= 10; no++) {
                sleep(500);

                System.out.println();
                System.out.println("--------------------------------------------");
                System.out.println(jobName);

                executorInfo(executor, no);
            }
        };
        return job;
    }

    private void executorInfo(ThreadPoolExecutor executor, int no) {
        int poolSize = executor.getPoolSize();
        int maximumPoolSize = executor.getMaximumPoolSize();
        int corePoolSize = executor.getCorePoolSize();
        int largestPoolSize = executor.getLargestPoolSize();

        int queueSize = executor.getQueue().size();
        int activeCount = executor.getActiveCount();
        long taskCount = executor.getTaskCount();
        long completedTaskCount = executor.getCompletedTaskCount();

        Thread currentThread = Thread.currentThread();
        ThreadUtil.threadInfo(currentThread);
        
        print("{}, no = {}, poolSize = {}", currentThread.getName(), no, poolSize);
        print("{}, no = {}, maximumPoolSize = {}", currentThread.getName(), no, maximumPoolSize);
        print("{}, no = {}, corePoolSize = {}", currentThread.getName(), no, corePoolSize);
        print("{}, no = {}, largestPoolSize = {}", currentThread.getName(), no, largestPoolSize);
        print("{}, no = {}, queueSize = {}", currentThread.getName(), no, queueSize);
        print("{}, no = {}, activeCount = {}", currentThread.getName(), no, activeCount);
        print("{}, no = {}, taskCount = {}", currentThread.getName(), no, taskCount);
        print("{}, no = {}, completedTaskCount = {}", currentThread.getName(), no, completedTaskCount);
    }

}