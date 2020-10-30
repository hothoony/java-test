package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test_filter {

    @Test
    void test_filter() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("list = " + list);

        List<Integer> result = list.stream()
                .filter(o -> o % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("result = " + result);

        assertThat(result)
                .containsExactly(2, 4, 6, 8, 10);
    }
}
