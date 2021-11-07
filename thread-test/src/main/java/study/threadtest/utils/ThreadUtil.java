package study.threadtest.utils;

import static study.threadtest.utils.PrintUtil.print;

public class ThreadUtil {

    public static void threadInfo(Thread thread) {
        System.out.println();
//        String threadName = thread.getName();
        String threadName = thread.getThreadGroup().getName() + " " + thread.getName();
        print(threadName + " getId() = {}", thread.getId());
        print(threadName + " getName() = {}", thread.getName());
        print(threadName + " getThreadGroup() = {}", thread.getThreadGroup());
        print(threadName + " getPriority() = {}", thread.getPriority());
        print(threadName + " getState() = {}", thread.getState());
        print(threadName + " isAlive() = {}", thread.isAlive());
        print(threadName + " isDaemon() = {}", thread.isDaemon());
        print(threadName + " isInterrupted() = {}", thread.isInterrupted());
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
