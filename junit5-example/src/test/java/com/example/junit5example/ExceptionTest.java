package com.example.junit5example;

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
