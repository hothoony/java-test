package com.example.reflectiontest.utils;

import com.example.reflectiontest.dto.MemberDto;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static com.example.reflectiontest.utils.ReflectionUtil.getAllFields;

class ReflectionUtilTest {

    @Test
    void getAllFieldsTest() {
        List<Field> fields = getAllFields(MemberDto.class, new ArrayList<>());
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}