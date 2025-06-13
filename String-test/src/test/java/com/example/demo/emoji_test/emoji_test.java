package com.example.demo.emoji_test;

import org.junit.jupiter.api.Test;

public class emoji_test {

    @Test
    void test1() {

        String str = """
                1748830506807_� 제목 다기능 음식 합성기 � 부제 미래형 조리의 혁신 � 발표자 [너의 이름 입력] 배경 추천-0.png
                """;
        System.out.println("str = " + str);

        str = str.replaceAll("[\\p{Cntrl}]", "");
        System.out.println("str = " + str);

        str = str.replaceAll("[\\p{C}]", "");
        System.out.println("str = " + str);

        str = str.replaceAll("[\\p{So}]", "");
        System.out.println("str = " + str);
    }
}
