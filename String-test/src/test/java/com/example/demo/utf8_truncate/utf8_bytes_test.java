package com.example.demo.utf8_truncate;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class utf8_bytes_test {

    @Test
    void utf8_bytes_num() {
        String str = "12345";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("bytes.length = " + bytes.length);
        assertThat(bytes.length).isEqualTo(5);
    }

    @Test
    void utf8_bytes_ko() {
        String str = "한글입니다";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("bytes.length = " + bytes.length);
        assertThat(bytes.length).isEqualTo(15);
    }

    @Test
    void utf8_bytes_en() {
        String str = "abcde";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("bytes.length = " + bytes.length);
        assertThat(bytes.length).isEqualTo(5);
    }
}
