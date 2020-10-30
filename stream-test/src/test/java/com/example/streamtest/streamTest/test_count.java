package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test_count {

    @Test
    void test_count() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("list = " + list);

        long count = list.stream().count();
        assertThat(count).isEqualTo(10);

        long count1 = list.stream()
                .filter(o -> o > 5)
                .count();
        assertThat(count1).isEqualTo(5);
    }
}
