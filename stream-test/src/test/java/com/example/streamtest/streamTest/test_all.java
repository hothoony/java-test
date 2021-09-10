package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class test_all {
    
    List<Integer> list = Arrays.asList(3, 2, 1, 5, 4);

    @Test
    void count() {
        long count = list.stream().count();
        System.out.println("count = " + count);
    }

    @Test
    void min_max() {
        Optional<Integer> min = list.stream().min(Comparator.comparing(Integer::valueOf));
        System.out.println("min.get() = " + min.get());

        Optional<Integer> max = list.stream().max(Comparator.comparing(Integer::valueOf));
        System.out.println("max.get() = " + max.get());
    }

    @Test
    void sum() {
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println("sum = " + sum);
    }
}
