package com.example.maplisttest.List_test;

import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ListTest {

    @Test
    void test_ListOf() {
        List<String> list = List.of("value1", "value2", "value3");
        System.out.println("list = " + list);
    }

    @Test
    void test_ListOfMap() {
        List<Map<String, Object>> list = List.of(
                Map.of("name", "james", "age", 20),
                Map.of("name", "paul", "age", 25),
                Map.of("name", "tom", "age", 22)
        );

        for (Map<String, Object> map : list) {
            System.out.println("map = " + map);
        }
    }
}
