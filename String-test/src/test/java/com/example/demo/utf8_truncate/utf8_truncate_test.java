package com.example.demo.utf8_truncate;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class utf8_truncate_test {

    @Test
    void utf8_truncate_test() {
        String str = "12345한글입니다abcde";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("bytes.length = " + bytes.length);
        assertThat(bytes.length).isEqualTo(5);
    }
}
