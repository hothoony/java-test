package com.example.streamtest.streamTest;

import lombok.Getter;
import lombok.ToString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test_map {

    List<SomeDto> list = Arrays.asList(
            new SomeDto(1, "aa"),
            new SomeDto(2, "bb"),
            new SomeDto(3, "cc")
    );

    @Test
    void test_map() {
        System.out.println("list = " + list);

        List<String> result = list.stream()
                .map(someDto -> someDto.getValue())
                .collect(Collectors.toList());

        System.out.println("result = " + result);

        assertThat(result)
                .containsExactly("aa", "bb", "cc");
    }

    @Getter
    @ToString
    static class SomeDto {
        private int id;
        private String value;

        public SomeDto(int id, String value) {
            this.id = id;
            this.value = value;
        }
    }
}
