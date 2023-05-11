package com.example.reflectiontest.utils;

import java.lang.reflect.Field;
import java.util.List;

public class ReflectionUtil {

    public static List<Field> getAllFields(Class clazz, List<Field> fieldList) {
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
