package com.example.demo.utf8_truncate;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class utf8_truncate_test {

    @Test
    void utf8_truncate_test() {

        String str = "12345한글입니다abcde";

        System.out.println("maxBytes 5 = " + truncateUtf8(str, 5));
        System.out.println("maxBytes 10 = " + truncateUtf8(str, 10));
        System.out.println("maxBytes 15 = " + truncateUtf8(str, 15));
    }

    /**
     * 문자열을 UTF-8 기준으로 maxBytes 바이트까지 자름
     */
    public static String truncateUtf8(String str, int maxBytes) {
        if (str == null) return null;

        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= maxBytes) {
            return str;
        }

        int byteCount = 0;
        int endIndex = 0;
        for (char c : str.toCharArray()) {
            int charBytes = String.valueOf(c).getBytes(StandardCharsets.UTF_8).length;
            if (byteCount + charBytes > maxBytes) {
                break;
            }
            byteCount += charBytes;
            endIndex++;
        }
        return str.substring(0, endIndex);
    }
}
