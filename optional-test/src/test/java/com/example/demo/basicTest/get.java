package com.example.demo.basicTest;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class get {

    @Test
    void get() {
        Optional<String> optional = Optional.empty();

        assertThatThrownBy(() -> optional.get())
                .isInstanceOf(NoSuchElementException.class);
    }
}
