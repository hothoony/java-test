package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class test_min_max {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Test
    void test_min() {
        Optional<Integer> min = list.stream()
                .min(Comparator.comparing(Integer::valueOf));
        assertThat(min.get()).isEqualTo(1);
    }

    @Test
    void test_max() {
        Optional<Integer> max = list.stream()
                .max(Comparator.comparing(Integer::valueOf));
        assertThat(max.get()).isEqualTo(10);
    }
}
