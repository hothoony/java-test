package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test_sorted {

    @Test
    void test_sorted_ascending() {
        List<String> list = Arrays.asList(
                "candy", "zebra", "zoo", "banana", "apple"
        );

        System.out.println("list = " + list);

        List<String> result = list.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());

        System.out.println("result = " + result);
    }

    @Test
    void test_sorted_descending() {
        List<String> list = Arrays.asList(
                "candy", "zebra", "zoo", "banana", "apple"
        );

        System.out.println("list = " + list);

        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);

        List<String> result = list.stream()
                .sorted(comparator.reversed())
                .collect(Collectors.toList());

        System.out.println("result = " + result);
    }
}
