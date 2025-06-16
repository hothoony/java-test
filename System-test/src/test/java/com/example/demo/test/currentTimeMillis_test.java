package com.example.demo.test;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class currentTimeMillis_test {

    @Test
    void test1() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime  = " + localDateTime);

        long millis = System.currentTimeMillis();
        System.out.println("millis         = " + millis);

        LocalDateTime localDateTime2 = fromMillis(millis);
        System.out.println("localDateTime2 = " + localDateTime2);
    }

    public LocalDateTime fromMillis(long millis) {
        // UTC 기준 Instant로 변환
        Instant instant = Instant.ofEpochMilli(millis);
        System.out.println("instant (UTC)  = " + instant);

        // 시스템 기본 시간대 기준 LocalDateTime으로 변환
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        return dateTime;
    }
}
