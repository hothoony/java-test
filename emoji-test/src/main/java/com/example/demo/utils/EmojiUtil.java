package com.example.demo.utils;

public class EmojiUtil {

    // * mariadb
    //   - charset: utf-8
    //   - collate: utf8-general-ci
    // 에서는 3바이트 까지만 저장 가능하므로
    // 4바이트 이상 문자는 제거한다
    public static String remove4ByteChars(String str) {
        if (str == null) return null;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); ) {
            int codePoint = str.codePointAt(i);

            // U+0000 ~ U+FFFF : BMP (Basic Multilingual Plane) 영역까지만 허용 (UTF-8 최대 3바이트)
            if (codePoint <= 0xFFFF) {
//                System.out.println("codePoint 포함 = " + codePoint);
                sb.appendCodePoint(codePoint);
            } else {
//                System.err.println("codePoint 제거 = " + codePoint);
            }

            i += Character.charCount(codePoint);
        }

        return sb.toString();
    }
}
