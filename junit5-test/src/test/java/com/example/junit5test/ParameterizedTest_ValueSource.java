package com.example.junit5test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTest_ValueSource {

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void booleans(boolean bool) {
        System.out.println("bool = " + bool);
    }

    @ParameterizedTest
    @ValueSource(ints = {11, 22, 33})
    void ints(int num) {
        System.out.println("num = " + num);
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa", "bb", "cc"})
    void strings(String str) {
        System.out.println("str = " + str);
    }
    
//    @ParameterizedTest
//    @ValueSource(classes = {
//            Map.of("name", "james", "age", 20),
//            Map.of("name", "james", "age", 20),
//    })
//    void classes(int num) {
//        System.out.println("num = " + num);
//        Map.of("name", "james", "age", 20)
//    }
}
