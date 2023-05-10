package com.example.reflectiontest.utils;

import com.example.reflectiontest.dto.MemberDto;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.example.reflectiontest.utils.QueryResultMapper.*;

class QueryResultMapperTest {

    @Test
    void listMapToDtosTest() throws Exception {
        Map<String, Object> map1 = Map.of("name", "paul"
                ,"age", 20
                ,"page", 3
                ,"size", 5
                , "regDt", LocalDateTime.now());

        Map<String, Object> map2 = Map.of("name", "sam"
                ,"age", 22
                ,"page", 5
                ,"size", 10
                , "regDt", LocalDateTime.now());

        List<Map<String, Object>> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        for (Map<String, Object> map : mapList) {
            System.out.println("map = " + map);
        }

        System.out.println();
        List<MemberDto> memberDtos = listMapToDtos(mapList, MemberDto.class);
        for (MemberDto memberDto : memberDtos) {
            System.out.println("memberDto = " + memberDto);
            System.out.println("memberDto.getId() = " + memberDto.getId());
            System.out.println("memberDto.getName() = " + memberDto.getName());
            System.out.println("memberDto.getAge() = " + memberDto.getAge());
            System.out.println("memberDto.getPage() = " + memberDto.getPage());
            System.out.println("memberDto.getSize() = " + memberDto.getSize());
        }
    }
}
