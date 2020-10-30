package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test_joining {

    @Test
    void test_joining() {
        List<String> list = Arrays.asList(
                "candy", "zebra", "zoo", "banana", "apple"
        );

        System.out.println("list = " + list);

        String str = list.stream()
                .collect(Collectors.joining("::"))
                .toString();

        System.out.println("str = " + str);

        assertThat(str).isEqualTo("candy::zebra::zoo::banana::apple");
    }
}
