package com.example.streamtest.streamTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class test_sorted {

    List<String> list = Arrays.asList(
            "candy", "zebra", "zoo", "banana", "apple"
    );

    @Test
    void test_sorted_ascending() {
        List<String> result = list.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());

        assertThat(result).containsExactly("apple", "banana", "candy", "zebra", "zoo");
    }

    @Test
    void test_sorted_descending() {
        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);

        List<String> result = list.stream()
                .sorted(comparator.reversed())
                .collect(Collectors.toList());

        assertThat(result).containsExactly("zoo", "zebra", "candy", "banana", "apple");
    }
}
