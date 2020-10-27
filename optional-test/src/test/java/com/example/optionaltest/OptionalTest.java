package com.example.optionaltest;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OptionalTest {

    private String str = "";

    @Test
    void empty() {
        // don't
        Optional opt2 = null;
        assertThat(opt2).isNull();

        // do
        Optional opt = Optional.empty();
        assertThat(opt).isEqualTo(Optional.empty());
    }

    @Test
    void of_ofNullable() {
        assertThatThrownBy(() -> {
            Optional.of(null);
        }).isInstanceOf(NullPointerException.class);

        Optional<Object> optional2 = Optional.ofNullable(null);
        assertThat(optional2).isEqualTo(Optional.empty());
    }

    @Test
    void isPresent_isEmpty() {
        Optional optional = Optional.empty();
        String result = null;

        if (!optional.isPresent()) result = str;
        assertThat(result).isEqualTo(str);

        if (optional.isEmpty()) result = str;
        assertThat(result).isEqualTo(str);
    }

    @Test
    void orElse() {
        Optional<String> optional = Optional.empty();
        String result = null;

        result = optional.orElse(str);
        assertThat(result).isEqualTo(str);
    }

    @Test
    void orElseGet() {
        Optional<String> optional = Optional.empty();
        String result = null;

        result = optional.orElseGet(() -> str);
        assertThat(result).isEqualTo(str);

        result = optional.orElseGet(String::new);
        assertThat(result).isEqualTo(str);
    }

    @Test
    void orElseThrow() {
        Optional optional = Optional.empty();

        assertThatThrownBy(() -> {
            optional.orElseThrow(() -> {
                throw new IllegalStateException();
            });
        }).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void get() {
        Optional<String> optional = Optional.empty();

        assertThatThrownBy(() -> optional.get())
                .isInstanceOf(NoSuchElementException.class);
    }
}
