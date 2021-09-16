package com.example.assertjtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class true_false {

    @Test
    void isTrue() {
        boolean result = true;
        assertThat(result).isTrue();
    }

    @Test
    void isFalse() {
        boolean result = false;
        assertThat(result).isFalse();
    }

}
