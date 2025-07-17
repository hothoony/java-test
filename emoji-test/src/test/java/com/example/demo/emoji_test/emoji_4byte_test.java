package com.example.demo.emoji_test;

import com.example.demo.EmojiDto;
import org.junit.jupiter.api.Test;

public class emoji_4byte_test {

    @Test
    void removeEmoji_test() {

        String[] emojiGroups = {
                // 3바이트 이모지: BMP 영역의 단순 기호
                "✔✖❤☀☕",

                // 4바이트 이모지: 대부분의 일반 이모지
                "😀🎉🚀🧡🦄",

                // 4바이트 이상 이모지: ZWJ 조합형 (5바이트 이상)
                "👨‍👩‍👧‍👦👨‍💻"
        };

//        String[] list = EmojiDto.emojiStringList;
        String[] list = emojiGroups;

        for (String emojiString : list) {
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

    @Test
    void test2() {
        String str = "❤️🧡💛💚💙💜🖤🤍🤎💔❣️💕💞💓💗💖💘💝💟";
        System.out.println("str = " + str);
    }
}
