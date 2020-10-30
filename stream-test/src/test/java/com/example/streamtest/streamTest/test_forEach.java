package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class test_forEach {

    private List<String> list = Arrays.asList("aa", "bb", "cc");

    @Test
    void test_forEach_lambda() {
        list.stream().forEach(s -> System.out.println(s));
    }

    @Test
    void test_forEach_method_references() {
        list.stream().forEach(System.out::println);
    }
}
