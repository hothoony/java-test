package com.example.junit5example;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTests {

    @RepeatedTest(3)
    void test() {
        System.out.println("test");
    }
}
