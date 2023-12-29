package study.threadtest.threadPool;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

    @Test
    void test1() throws InterruptedException {

        int threadCount = 32;

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        System.out.println("executorService = " + executorService);

        CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            executorService.execute(() -> {
                try {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + " => 1. DB 데이터 조회");
                    System.out.println(threadName + " => 2. 객체 데이터 업데이트");
                    System.out.println(threadName + " => 3. DB 데이터 업데이트");
                } finally {
                    countDownLatch.countDown();
                }
            });
        }

        countDownLatch.await();

        System.out.println("executorService.isShutdown() = " + executorService.isShutdown());
        System.out.println("executorService.isTerminated() = " + executorService.isTerminated());
        executorService.shutdown();
        System.out.println("executorService.isShutdown() = " + executorService.isShutdown());
        System.out.println("executorService.isTerminated() = " + executorService.isTerminated());
    }

}
