package com.example.demo.basicTest;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class empty {

    @Test
    void empty() {
        // don't
        Optional opt2 = null;
        assertThat(opt2).isNull();

        // do
        Optional opt = Optional.empty();
        assertThat(opt).isEqualTo(Optional.empty());
    }

}
