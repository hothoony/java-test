package study.threadtest.threadPool;

import org.junit.jupiter.api.Test;
import study.threadtest.utils.ThreadUtil;

import static study.threadtest.utils.PrintUtil.print;
import static study.threadtest.utils.ThreadUtil.*;
import static study.threadtest.utils.ThreadUtil.sleep;
import static study.threadtest.utils.ThreadUtil.threadInfo;

public class ThreadTest {

    @Test
    void test1() {
        
        Runnable job = () -> {
            sleep(1000);
            for (int i = 1; i <= 10; i++) {
                sleep(500);
                threadInfo(Thread.currentThread());
                print(Thread.currentThread().getName() + " job = {}", i);
            }
        };

        Thread threadA = new Thread(job);
        threadA.setName("threadA");
        
        Thread threadB = new Thread(job);
        threadB.setName("threadB");
        
        threadA.start();
        threadB.start();

        threadInfo(threadA);
        threadInfo(threadB);
        
        sleep(10000);
    }
}
