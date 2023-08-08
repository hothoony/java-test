package com.example.maplisttest.Map_test;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class MapOfEntries_test {

    @Test
    void test1() {

        Map<String, String> map = Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2"),
                Map.entry("key3", "value3"),
                Map.entry("key4", "value4"),
                Map.entry("key5", "value5"),
                Map.entry("key6", "value6"),
                Map.entry("key7", "value7"),
                Map.entry("key8", "value8"),
                Map.entry("key9", "value9"),
                Map.entry("key10", "value10"),
                Map.entry("key11", "value11") // 11 개 이상 입력 가능
        );

        System.out.println("map = " + map);
    }

    @Test
    void test2() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2"),
                Map.entry("key3", null) // value 에 null 을 입력하면 에러 발생
        );

        System.out.println("map = " + map);
    }
}
