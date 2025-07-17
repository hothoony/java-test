package com.example.demo.emoji_test;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class emoji_test2 {

    @Test
    void test1() {
        String[] strList = {
                "1749805257343_1748830506807_\uD83D\uDCCC 제목 다기능 음식 합성기 \uD83D\uDCDD 부제 미래형 조리의 혁신 \uD83D\uDC64 발표자 [너의 이름 입력] 배경 추천.pptx",
                "1748830506807_� 제목 다기능 음식 합성기 � 부제 미래형 조리의 혁신 � 발표자 [너의 이름 입력] 배경 추천-0❤️✅❌.png",
                "😀😂🎉",
                "❤️✅❌",
                "👨‍👩‍👧‍👦",
                "A\u200B\u200D\u2060B", // ZWSP, ZWJ, WORD JOINER
                "텍스트😊중간에❤️특수문자✨포함"
        };

        for (String str : strList) {
            System.out.println();
            System.out.println("before : " + str);
            System.out.println("after  : " + removeEmoji(str));
        }
    }

    public static String removeEmoji(String input) {
        if (input == null) return null;

        Pattern EMOJI_PATTERN = Pattern.compile(
                "[\uD83C-\uDBFF\uDC00-\uDFFF]+"
        );

        return EMOJI_PATTERN.matcher(input).replaceAll("");
    }
}
