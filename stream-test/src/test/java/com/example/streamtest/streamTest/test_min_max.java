package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test_min_max {

    @Test
    void test_min_max() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("list = " + list);

        Optional<Integer> min = list.stream().min(Comparator.comparing(Integer::valueOf));
        System.out.println("min.get() = " + min.get());

        Optional<Integer> max = list.stream().max(Comparator.comparing(Integer::valueOf));
        System.out.println("max.get() = " + max.get());
    }
}
