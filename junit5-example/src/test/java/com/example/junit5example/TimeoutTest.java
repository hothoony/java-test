package com.example.junit5example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutTest {

    @Test
    @Timeout(3)
    void elapsed_5sec() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Test
    @Timeout(3)
    void elapsed_2sec() throws InterruptedException {
        Thread.sleep(2000);
    }
}
