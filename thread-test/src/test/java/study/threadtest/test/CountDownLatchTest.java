package study.threadtest.test;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    @Test
    void test1() throws InterruptedException {

        System.out.println("begin");

        // latch 갯수를 설정한다
        int count = 3;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        System.out.println("countDownLatch.getCount() = " + countDownLatch.getCount());

        for (int i = 0; i < count; i++) {
            Thread.sleep(1000);

            // latch 갯수가 1개씩 감소한다
            countDownLatch.countDown();
            System.out.println("countDownLatch.getCount() = " + countDownLatch.getCount());
        }

        // latch 갯수가 0이 될 때까지 기다린다
        countDownLatch.await();

        System.out.println("end");
    }
}
