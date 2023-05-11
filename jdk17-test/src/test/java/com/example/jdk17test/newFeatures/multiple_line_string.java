package com.example.jdk17test.newFeatures;

import org.junit.jupiter.api.Test;

public class multiple_line_string {

    @Test
    void textBlock() {
        String str = """
                123
                abc
                안녕하세요
                """;

        System.out.printf("\n\n1 str =>%s<=", str);
        System.out.printf("\n\n2 str =>%s<=", str.trim());
    }
}
