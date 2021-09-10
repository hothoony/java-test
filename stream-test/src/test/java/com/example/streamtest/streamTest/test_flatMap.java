package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test_flatMap {

    List<List<String>> list = Arrays.asList(
            Arrays.asList("11", "12"),
            Arrays.asList("21", "22"),
            Arrays.asList("31", "32")
    );
    
    @Test
    void test_flatMap() {

        System.out.println("list = " + list);

        List<String> result = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("result = " + result);

        assertThat(result.size()).isEqualTo(6);
        assertThat(result)
                .hasSize(6)
                .isEqualTo(Arrays.asList("11", "12", "21", "22", "31", "32"))
                .containsExactly("11", "12", "21", "22", "31", "32");
    }
}
