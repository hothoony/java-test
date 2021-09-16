package com.example.assertjtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class null_notNull {

    @Test
    void isNull() {
        String name = null;
        assertThat(name).isNull();
    }

    @Test
    void isNotNull() {
        String name = "";
        assertThat(name).isNotNull();
    }
}
