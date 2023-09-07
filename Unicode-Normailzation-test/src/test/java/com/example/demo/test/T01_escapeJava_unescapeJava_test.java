package com.example.demo.test;

import org.apache.commons.text.StringEscapeUtils;
import org.junit.jupiter.api.Test;

public class T01_escapeJava_unescapeJava_test {

    @Test
    void escapeJava_test() {

        String str = StringEscapeUtils.escapeJava("한글");
        System.out.println("str = " + str); // \uD55C\uAE00
    }

    @Test
    void unescapeJava_test() {

        String str = StringEscapeUtils.unescapeJava("\\uD55C\\uAE00");
        System.out.println("str = " + str); // 한글
    }
}
