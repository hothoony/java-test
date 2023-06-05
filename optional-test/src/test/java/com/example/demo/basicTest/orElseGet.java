package com.example.demo.basicTest;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class orElseGet {

    /**
     * 값 대신
     * - lamda expression 사용
     * - method reference 사용
     */

    @Test
    void orElseGet_lamda() {
        Optional<String> optional = Optional.empty();

        String result = optional.orElseGet(() -> "");
        assertThat(result).isEqualTo("");
    }

    @Test
    void orElseGet_methodReference() {
        Optional<String> optional = Optional.empty();

        String result = optional.orElseGet(String::new);
        assertThat(result).isEqualTo("");
    }
}
