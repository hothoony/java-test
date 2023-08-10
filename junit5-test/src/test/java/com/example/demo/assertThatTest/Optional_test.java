package com.example.demo.assertThatTest;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class Optional_test {

    @Test
    void test() {

        assertThat(Optional.empty()).isNotNull();
        assertThat(Optional.empty()).isEmpty();
    }
}
