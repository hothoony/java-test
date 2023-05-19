package com.example.demo.String_test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class concat_test {

    @Test
    void plus_test() {
        String str = "111" + "aaa" + "222";
        System.out.println("str = " + str);
    }

    @Test
    void String_join() {
        String str = String.join("111", "aaa", "222");
        System.out.println("str = " + str);
    }

    @Test
    void String_concat() {
        String str = "111".concat("aaa").concat("222");
        System.out.println("str = " + str);
    }
    
    @Test
    void String_format() {
        String str = String.format("%s%s%s", "111", "aaa", "222");
        System.out.println("str = " + str);
    }

    @Test
    void StringBuilder_test() {
        StringBuilder sb = new StringBuilder();
        sb.append("111");
        sb.append("aaa");
        sb.append("222");
        System.out.println("sb.toString() = " + sb.toString());
    }

    @Test
    void StringBuffer_test() {
        StringBuffer sb = new StringBuffer();
        sb.append("111");
        sb.append("aaa");
        sb.append("222");
        System.out.println("sb.toString() = " + sb.toString());
    }

    @Test
    void StringJoiner_test() {
        StringJoiner stringJoiner = new StringJoiner("");
        stringJoiner.add("111");
        stringJoiner.add("aaa");
        stringJoiner.add("222");
        System.out.println("stringJoiner.toString() = " + stringJoiner.toString());
    }

    @Test
    void Array_toString() {
        String str = Arrays.toString(new String[]{"111", "aaa", "222"});
        System.out.println("str = " + str);
    }

    @Test
    void Collectors_joining() {
        List<String> list = Arrays.asList("111", "aaa", "222");
        String str = list.stream().collect(Collectors.joining(""));
        System.out.println("str = " + str);
    }
}
