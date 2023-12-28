package com.example.demo.junit5Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedTest_CsvSource {

    @ParameterizedTest
    @CsvSource(value = {"aa,true", "bb,false"})
    void test1(String name, boolean bool) {
        System.out.println("name = " + name);
        System.out.println("bool = " + bool);
    }
}
