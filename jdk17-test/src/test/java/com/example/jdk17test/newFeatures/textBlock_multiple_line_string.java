package com.example.jdk17test.newFeatures;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class textBlock_multiple_line_string {
    
    String compareStr;

    @BeforeEach
    void setUp() {
        String LN = "\n";
        
        StringBuilder sb = new StringBuilder();
        sb.append("123" + LN);
        sb.append("abc" + LN);
        sb.append("안녕하세요" + LN);
        compareStr = sb.toString();

        System.out.println("compareStr =>" + compareStr + "<=");
    }

    @Test
    void test11() {
        String str = """
                123
                abc
                안녕하세요
                """;

        System.out.printf("\n\n1 str =>%s<=", str);
        System.out.printf("\n\n2 str =>%s<=", str.trim());

        assertThat(str).isEqualTo(compareStr);
    }

    @Test
    void test12() {
        String str = """
123
abc
안녕하세요
                """;

        System.out.printf("\n\n1 str =>%s<=", str);
        System.out.printf("\n\n2 str =>%s<=", str.trim());

        assertThat(str).isEqualTo(compareStr);
    }

    @Test
    void test13() {
        String str = """
                    123
                    abc
                    안녕하세요
                    """;

        System.out.printf("\n\n1 str =>%s<=", str);
        System.out.printf("\n\n2 str =>%s<=", str.trim());

        assertThat(str).isEqualTo(compareStr);
    }

    @Test
    void test14() {
        String str = """
                                123
                                abc
                                안녕하세요
                                """;

        System.out.printf("\n\n1 str =>%s<=", str);
        System.out.printf("\n\n2 str =>%s<=", str.trim());

        assertThat(str).isEqualTo(compareStr);
    }

    @Test
    void test15() {
        String str = """
                                123
                                abc
                                안녕하세요
                                    """;

        System.out.printf("\n\n1 str =>%s<=", str);
        System.out.printf("\n\n2 str =>%s<=", str.trim());

        assertThat(str).isEqualTo(compareStr);
    }

    @Test
    void test16() {
        String str = """
                        123
                        abc
                        안녕하세요
                    """;

        System.out.printf("\n\n1 str =>%s<=", str);
        System.out.printf("\n\n2 str =>%s<=", str.trim());

        assertThat(str).isNotEqualTo(compareStr);
    }

    @Test
    void test2() {
        String str = """
                123
                abc
                안녕하세요""";

        System.out.printf("\n\n1 str =>%s<=", str);
        System.out.printf("\n\n2 str =>%s<=", str.trim());

        assertThat(str).isNotEqualTo(compareStr);
    }

    @Test
    void test3() {
        String str = """
123
                abc
                안녕하세요""";

        System.out.printf("\n\n1 str =>%s<=", str);
        System.out.printf("\n\n2 str =>%s<=", str.trim());

        assertThat(str).isNotEqualTo(compareStr);
    }
}
