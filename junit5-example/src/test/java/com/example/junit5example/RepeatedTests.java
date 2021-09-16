package com.example.junit5example.junit5;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTests {

    @RepeatedTest(3)
    void test() {
        System.out.println("test");
    }
}
