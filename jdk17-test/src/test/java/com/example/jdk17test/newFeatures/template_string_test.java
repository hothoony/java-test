package com.example.jdk17test.newFeatures;

import org.junit.jupiter.api.Test;

public class template_string_test {

    /*
        jdk 21 이후로 지원함
     */
    
    @Test
    void templateString_test() {
        String str = """
                안녕하세요 ${name} 님!
                ${name} 님, 오늘도 좋은 하루 되세요.
                """;

        System.out.println("str = " + str);
        System.out.println("str = " + str.replace("${name}", "james"));
    }

    @Test
    void templateString_test2() {
        String str = """
                안녕하세요 ${name} 님!
                ${name} 님, 오늘도 좋은 하루 되세요.
                """;

        System.out.println("str = " + str);
        System.out.println("str = " + str.replace(bindingVar("name"), "james"));
    }

    private String bindingVar(String name) {
        return "${" + name + "}";
    }
}
