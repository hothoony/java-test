package com.example.maplisttest.test;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class MapTest {

    @Test
    void test_MapOf() {
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        System.out.println("map = " + map);
    }
}
