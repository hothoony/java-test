package com.example.demo.StringUtils_test;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class hasText {

    @Test
    void hasText() {
        assertThat(StringUtils.hasText(null)).isFalse();
        assertThat(StringUtils.hasText("")).isFalse();
        assertThat(StringUtils.hasText(" ")).isFalse();
        assertThat(StringUtils.hasText(".")).isTrue();
    }
}
