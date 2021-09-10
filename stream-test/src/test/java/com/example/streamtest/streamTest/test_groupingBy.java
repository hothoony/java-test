package com.example.streamtest.streamTest;

import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test_groupingBy {

    List<MemberDto> list = Arrays.asList(
            new MemberDto(1, "aa"),
            new MemberDto(2, "bb"),
            new MemberDto(3, "cc"),
            new MemberDto(4, "dd"),
            new MemberDto(1, "ee")
    );
    
    @Test
    void groupingBy() {
        list.forEach(System.out::println);

        Map<Integer, List<MemberDto>> map = list.stream()
                .collect(Collectors.groupingBy(o -> o.getId()));

        map.keySet().forEach(key -> System.out.println(key + " => " + map.get(key)));
    }
    
    @Getter
    static class MemberDto {
        private int id;
        private String name;

        public MemberDto(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "MemberDto{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
