package com.example.maplisttest.Map_test;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class MapOf_test {

    @Test
    void MapOf_test1() {
        
        // 10 개 까지 입력 가능
        Map<String, String> map = Map.of(
                "key1", "value1",
                "key2", "value2",
                "key3", "value3",
                "key4", "value4",
                "key5", "value5",
                "key6", "value6",
                "key7", "value7",
                "key8", "value8",
                "key9", "value9",
                "key10", "value10"
//                , "key11", "value10" // 11개 째 넣으면 에러가 발생
        );
        
        System.out.println("map = " + map);
    }

    @Test
    void MapOf_test2() {

        // value 에 null 을 넣으면 NullPointerException 이 발생한다
        Map<String, String> map = Map.of(
                "key1", "value1",
                "key2", "value2",
                "key3", null
        );

        System.out.println("map = " + map);
    }
}
