package com.example.classtypetest.typeTest;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class isAssignableFromTest {

    @Test
    void test1() {
        Map<String, Object> hashMap1 = new HashMap<>();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        Map<String, Object> linkedHashMap1 = new LinkedHashMap<>();
        HashMap<String, Object> linkedHashMap2 = new LinkedHashMap<>();
        LinkedHashMap<String, Object> linkedHashMap3 = new LinkedHashMap<>();

        typeTest(hashMap1, "hashMap1");
        typeTest(hashMap2, "hashMap2");
        typeTest(linkedHashMap1, "linkedHashMap1");
        typeTest(linkedHashMap2, "linkedHashMap2");
        typeTest(linkedHashMap3, "linkedHashMap3");
    }

    private static void typeTest(Object object, String name) {
        System.out.println();
        System.out.println("name = " + name);
        System.out.println("object.getClass().getSuperclass() = " + object.getClass().getSuperclass());
        System.out.println("object.getClass().isAssignableFrom(Map.class)           = " + object.getClass().isAssignableFrom(Map.class));
        System.out.println("object.getClass().isAssignableFrom(HashMap.class)       = " + object.getClass().isAssignableFrom(HashMap.class));
        System.out.println("object.getClass().isAssignableFrom(LinkedHashMap.class) = " + object.getClass().isAssignableFrom(LinkedHashMap.class));
    }
}
