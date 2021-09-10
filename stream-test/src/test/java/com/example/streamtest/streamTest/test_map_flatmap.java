package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class test_map_flatmap {

    Integer[][] list = {{1, 2}, {3, 4}};
    
    @Test
    void map() {
        Stream<Stream<Integer>> stream = Arrays.stream(list).map(x -> Arrays.stream(x));
        stream.forEach(s -> s.forEach(System.out::println));
    }

    @Test
    void flatmap() {
        Stream<Integer> stream = Arrays.stream(list).flatMap(x -> Arrays.stream(x));
        stream.forEach(System.out::println);
    }
}
