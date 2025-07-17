package com.example.demo.emoji_test;

public class emoji_4byte_test {

    public static String remove4ByteChars(String str) {
        if (str == null) return null;
        return str.codePoints()
                .filter(cp -> cp <= 0xFFFF)  // BMP 문자(3바이트 이하)만 허용
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

}
