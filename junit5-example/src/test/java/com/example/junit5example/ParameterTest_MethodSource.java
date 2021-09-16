package com.example.junit5example.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParameterTest_MethodSource {

    static Stream<Arguments> testParam1() {
        return Stream.of(
                Arguments.of("member1", 10),
                Arguments.of("member1", null),
                Arguments.of(null, 10),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("testParam1")
    void paramTest(String username, Integer age) {
        System.out.println(username + ", " + age);
    }
}
