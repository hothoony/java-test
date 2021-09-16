package com.example.junit5example.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    @Test
    void testThrows() {
        assertThrows(IllegalStateException.class, () -> {
            throw new IllegalStateException();
        });
    }

    @Test
    void testNotThrows() {
        assertThrows(IllegalStateException.class, () -> {

        });
    }
}
