package com.example.demo.StringUtils_test;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class trimWhitespace {

    @Test
    void trimWhitespace() {
        assertThat(StringUtils.trimWhitespace(null)).isNull();
        assertThat(StringUtils.trimWhitespace("")).isEmpty();
        assertThat(StringUtils.trimWhitespace("")).isEqualTo("");
        assertThat(StringUtils.trimWhitespace(" aa bb ")).isEqualTo("aa bb");
    }
}
