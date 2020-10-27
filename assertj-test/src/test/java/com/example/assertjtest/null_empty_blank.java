package com.example.assertjtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class null_empty_blank {

    @Test
    void null_notNull() {
        String str1 = null;
        String str2 = "";

        assertThat(str1).isNull();
        assertThat(str2).isNotNull();
    }

    @Test
    void test_null() {
        String str = null;

        assertThat(str).isNull();
        assertThatThrownBy(() -> assertThat(str).isEmpty()).isInstanceOf(AssertionError.class);
        assertThatThrownBy(() -> assertThat(str).isNotEmpty()).isInstanceOf(AssertionError.class);
        assertThat(str).isBlank();
    }

    @Test
    void test_empty() {
        String str = "";

        assertThat(str).isNotNull();
        assertThat(str).isEmpty();
        assertThat(str).isBlank();
    }

    @Test
    void test_blank() {
        String str = " ";

        assertThat(str).isNotNull();
        assertThat(str).isNotEmpty();
        assertThat(str).isBlank();
    }
}
