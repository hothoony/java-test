package com.example.maplisttest.Map_test;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Map_test {

    @Test
    void test1() {

        // 10 개 이상 입력 가능
        Map<String, Object> map = new HashMap<>() {{
            put("key1", "value1");
            put("key2", "value2");
            put("key3", "value3");
            put("key4", "value4");
            put("key5", "value5");
            put("key6", "value6");
            put("key7", "value7");
            put("key8", "value8");
            put("key9", "value9");
            put("key10", "value10");
            put("key11", "value11");
        }};

        System.out.println("map = " + map);
    }

    @Test
    void test2() {

        // value 에 null 입력 가능
        Map<String, Object> map = new HashMap<>() {{
            put("key1", "value1");
            put("key2", "value2");
            put("key3", null);
        }};

        System.out.println("map = " + map);
    }
}
