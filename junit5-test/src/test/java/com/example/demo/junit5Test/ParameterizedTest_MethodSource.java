package com.example.demo.junit5Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

public class ParameterizedTest_MethodSource {

    @ParameterizedTest
    @MethodSource("paramsBasic")
    void paramsTest(String username, Integer age) {
        System.out.println(username + ", " + age);
    }

    @ParameterizedTest
    @MethodSource("paramsMap")
    void mapParamsTest(Map<String, Object> map) {
        System.out.println("map = " + map);
    }

    static Stream<Map<String, Object>> paramsMap() {
        return Stream.of(
                Map.of("name", "james", "age", 20),
                Map.of("name", "paul", "age", 22)
        );
    }

    static Stream<Arguments> paramsBasic() {
        return Stream.of(
                Arguments.of("member1", 10),
                Arguments.of("member1", null),
                Arguments.of(null, 10),
                Arguments.of(null, null)
        );
    }
}
