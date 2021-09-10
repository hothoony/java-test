package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test_joining {

    List<String> list = Arrays.asList(
            "candy", "zebra", "zoo", "banana", "apple"
    );

    @Test
    void test_joining() {
        
        System.out.println("list = " + list);

        String str = list.stream()
                .collect(Collectors.joining("::"));

        System.out.println("str = " + str);

        assertThat(str).isEqualTo("candy::zebra::zoo::banana::apple");
    }
}
