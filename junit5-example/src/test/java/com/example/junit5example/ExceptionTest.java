package com.example.junit5example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    @Test
    void junit5_throwEx() {
        assertThrows(IllegalStateException.class, () -> throwEx());
    }

    @Test
    void assertj_throwEx() {
        assertThatThrownBy(() -> throwEx())
                .isInstanceOf(IllegalStateException.class);
    }
    
    void throwEx() {
        throw new IllegalStateException("익셉션 발생!!");
    }
}
