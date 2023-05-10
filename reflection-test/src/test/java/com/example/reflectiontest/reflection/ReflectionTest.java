package com.example.reflectiontest.reflection;

import com.example.reflectiontest.dto.MemberDto;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.reflectiontest.utils.QueryResultMapper.*;

public class ReflectionTest {

    @Test
    void name() throws IllegalAccessException {
        MemberDto instance = new MemberDto();
        
        Class clazz = MemberDto.class;
        Field[] declaredFields = clazz.getDeclaredFields();

        Class superclazz = clazz.getSuperclass();
        System.out.println("superclazz = " + superclazz);

        for (Field field : declaredFields) {
            System.out.println();
            System.out.println("field = " + field);
            System.out.println("field.getType() = " + field.getType());
            System.out.println("field.getName() = " + field.getName());
            System.out.println("field.canAccess() = " + field.canAccess(instance));

            if (!field.canAccess(instance)) {
                field.setAccessible(true);
            }
            
            if ("name".equals(field.getName())) {
                field.set(instance, "paul");
            }
        }

        System.out.println();
        System.out.println("instance = " + instance);
    }

    @Test
    void mapToDtoTest() {
        Map<String, Object> map;
        
        map = new HashMap<>();
        map.put("name", "paul");
        map.put("age", 20);
        map.put("page", 3);
        map.put("size", 5);
        map.put("regDt", LocalDateTime.now());

        List<Map<String, Object>> list = new ArrayList<>();
        list.add(map);

        listMapToDto(list, MemberDto.class);
    }

    @Test
    void getAllFieldsTest() {
        ArrayList<Field> fieldList = new ArrayList<>();
        getAllFields(MemberDto.class, fieldList);

        for (Field field : fieldList) {
            System.out.println("field = " + field);
        }
    }

    private List<Field> getAllFields(Class clazz, List<Field> fieldList) {
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            fieldList.add(field);
        }
        Class superclazz = clazz.getSuperclass();
//        superclazz = class com.example.reflectiontest.dto.WebDto
//        superclazz.getTypeName() = com.example.reflectiontest.dto.WebDto
//        System.out.println("superclazz = " + superclazz);
//        System.out.println("superclazz.getTypeName() = " + superclazz.getTypeName());
        if (!"java.lang.Object".equals(superclazz.getTypeName())) {
            return getAllFields(superclazz, fieldList);
        }
        return fieldList;
    }
}
