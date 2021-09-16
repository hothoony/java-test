package com.example.junit5example.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterTest_ValueSource {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void test1(int num) {
        System.out.println(num + 10);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "b", "c"})
    void test2(String str) {
        System.out.println(str);
    }
}
