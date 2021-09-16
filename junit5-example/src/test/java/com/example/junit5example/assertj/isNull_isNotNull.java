package com.example.junit5example.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class isNull_isNotNull {

    @Test
    void isNull() {
        String result = null;
        assertThat(result).isNull();
    }

    @Test
    void isNotNull() {
        String result = "";
        assertThat(result).isNotNull();
    }
}
