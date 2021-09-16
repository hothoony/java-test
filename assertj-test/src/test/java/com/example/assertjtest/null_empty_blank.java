package com.example.assertjtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class null_empty_blank {

    @Test
    void isNull() {
        String str = null;

        assertThat(str).isNull();
        assertThatThrownBy(() -> assertThat(str).isEmpty()).isInstanceOf(AssertionError.class);
        assertThatThrownBy(() -> assertThat(str).isNotEmpty()).isInstanceOf(AssertionError.class);
        assertThat(str).isBlank();
    }

    @Test
    void isEmpty() {
        String str = "";

        assertThat(str).isNotNull();
        assertThat(str).isEmpty();
        assertThat(str).isBlank();
    }

    @Test
    void isBlank() {
        String str = " ";

        assertThat(str).isNotNull();
        assertThat(str).isNotEmpty();
        assertThat(str).isBlank();
    }

    @Test
    void isNotBlank() {
        String str = ".";

        assertThat(str).isNotNull();
        assertThat(str).isNotEmpty();
        assertThat(str).isNotBlank();
    }
    
}
