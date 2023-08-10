package com.example.demo.assertThatTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test01 {

    @Test
    void null_test() {
        
        String str = null;

        assertThat(str).isNull();
        assertThat(str).isEmpty();
        assertThat(str).isBlank();
    }

    @Test
    void empty_test() {
        
        String str = "";

        assertThat(str).isNotNull();
        assertThat(str).isEmpty();
        assertThat(str).isBlank();
    }

    @Test
    void blank_test() {

        String str = " ";

        assertThat(str).isNotNull();
        assertThat(str).isNotEmpty();
        assertThat(str).isBlank();
    }
}
