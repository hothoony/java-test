package com.example.demo.test;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class orElseThrow {

    @Test
    void orElseThrow() {
        Optional optional = Optional.empty();

        assertThatThrownBy(() -> {
            optional.orElseThrow(() -> {
                throw new IllegalStateException("no value found");
            });
        })
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("no value found");
    }
}
