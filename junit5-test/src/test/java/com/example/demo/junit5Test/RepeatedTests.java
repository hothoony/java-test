package com.example.demo.junit5Test;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTests {

    @RepeatedTest(3)
    void test() {
        System.out.println("test");
    }
}
