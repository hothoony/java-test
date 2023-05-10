package com.example.reflectiontest.reflection;

import com.example.reflectiontest.dto.MemberDto;
import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.reflectiontest.utils.QueryResultMapper.*;

public class ReflectionTest {

    @Test
    void getAllFieldsTest() {
        List<Field> fields = getAllFields(MemberDto.class, new ArrayList<Field>());
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }

    private static List<Field> getAllFields(Class clazz, List<Field> fieldList) {
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            fieldList.add(field);
        }
        Class superclazz = clazz.getSuperclass();
        if (!"java.lang.Object".equals(superclazz.getTypeName())) {
            return getAllFields(superclazz, fieldList);
        }
        return fieldList;
    }
}
