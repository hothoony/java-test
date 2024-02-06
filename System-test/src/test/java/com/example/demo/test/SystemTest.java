package com.example.demo.test;

import org.junit.jupiter.api.Test;

public class SystemTest {

    @Test
    void millis_nano() {

        long millis = System.currentTimeMillis();
        System.out.println("millis   = " + millis);

        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);
    }

    @Test
    void millis_randomNano() {

        long millis = System.currentTimeMillis();
        System.out.println("millis    = " + millis);

        String millisStr = String.valueOf(millis);
        System.out.println("millisStr = " + millisStr);

        String nano = Utils.randomNumber(3);
        System.out.println("nano      = " + nano);

        String randomFilename = millisStr + "_" + nano;
        System.out.println("randomFilename = " + randomFilename);
    }

}
