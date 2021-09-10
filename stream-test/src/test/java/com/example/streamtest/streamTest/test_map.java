package com.example.streamtest.streamTest;

import com.example.streamtest.dto.MemberDto;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test_map {

    List<MemberDto> list = Arrays.asList(
            new MemberDto(1, "aa"),
            new MemberDto(2, "bb"),
            new MemberDto(3, "cc")
    );

    @Test
    void test_map() {
        System.out.println("list = " + list);

        List<String> result = list.stream()
                .map(someDto -> someDto.getName())
                .collect(Collectors.toList());

        System.out.println("result = " + result);

        assertThat(result)
                .containsExactly("aa", "bb", "cc");
    }
    
}
