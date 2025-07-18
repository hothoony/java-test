package com.example.demo.emoji_test;

import com.example.demo.EmojiDto;
import org.junit.jupiter.api.Test;

public class emoji_test {

    @Test
    void removeEmoji_test() {

        for (String emojiString : EmojiDto.emojiStringList) {
//            String removeResult = removeEmoji(emojiString);
            String removeResult = removeEmoji2(emojiString);
            System.out.println();
            System.out.println("before : " + emojiString);
            System.out.println("after  : " + removeResult);
//            assertThat(removeResult).isEmpty();
        }
    }

    public static String removeEmoji2(String str) {
        if (str == null) return null;
        return str
                .replaceAll("[^\\p{L}\\p{N}\\p{P}\\p{Z}]", "")
                .replaceAll("[\\p{S}]", "")
                .replaceAll("\\p{InEnclosedAlphanumericSupplement}", "")
                ;
    }

    public static String removeEmoji(String str) {
        if (str == null) return null;

        // 플래그 (Regional Indicator Symbols) 2개 연속 제거
        str = str.replaceAll("([\uD83C][\uDDE6-\uDDFF]){2}", "");

        // 이모지 범위 제거 (Symbols & Other)
        str = str.replaceAll("[\\p{So}]", "");

        // 서식, 제어 문자 제거
        str = str.replaceAll("[\\p{Cf}\\p{Cntrl}\\p{C}]", "");

        // Variation Selector 제거
        str = str.replaceAll("[\\uFE00-\\uFE0F]", "");

        // ZWSP, ZWJ, WORD JOINER 제거
        str = str.replaceAll("[\\u200B-\\u200D\\u2060]", "");

        return str;
    }

}
