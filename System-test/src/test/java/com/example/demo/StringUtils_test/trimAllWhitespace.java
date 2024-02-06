package com.example.demo.StringUtils_test;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class trimAllWhitespace {

    @Test
    void trimAllWhitespace() {
        assertThat(StringUtils.trimAllWhitespace(null)).isNull();
        assertThat(StringUtils.trimAllWhitespace("")).isEmpty();
        assertThat(StringUtils.trimAllWhitespace("")).isEqualTo("");
        assertThat(StringUtils.trimAllWhitespace(" aa bb ")).isEqualTo("aabb");
    }
}
