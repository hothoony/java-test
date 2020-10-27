package com.example.assertjtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class true_false {

    @Test
    void true_false() {
        assertThat(true).isTrue();
        assertThat(false).isFalse();
    }

}
