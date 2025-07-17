package com.example.demo.emoji_test;

import com.example.demo.EmojiDto;
import org.junit.jupiter.api.Test;

public class emoji_4byte_test {

    @Test
    void removeEmoji_test() {

        for (String emojiString : EmojiDto.emojiStringList) {
            String removeResult = remove4ByteChars(emojiString);
            System.out.println();
            System.out.println("before : " + emojiString);
            System.out.println("after  : " + removeResult);
//            assertThat(removeResult).isEmpty();
        }
    }

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
