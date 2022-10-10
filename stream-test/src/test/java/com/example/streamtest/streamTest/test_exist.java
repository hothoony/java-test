package com.example.streamtest.streamTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class test_exist {

    List<String> list = Arrays.asList("aa", "bb", "cc");

    @Test
    @DisplayName("리스트에서 값 찾기 - 값이 있을 때 O")
    void exist() {

        String foundValue = findValue("bb");
        System.out.println("foundValue = " + foundValue);
    }

    @Test
    @DisplayName("리스트에서 값 찾기 - 값이 없을 때 X")
    void notExist() {

        String foundValue = findValue("zz");
        System.out.println("foundValue = " + foundValue);
    }

    private String findValue(String valueToFind) {
        Optional<String> foundValue = list.stream()
                .filter(o -> o.equals(valueToFind))
                .findFirst();

        return foundValue.orElse("NO_VALUE");
    }
}
