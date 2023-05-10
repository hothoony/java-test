package com.example.reflectiontest.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QueryResultMapper {

    public static <T> List<T> listMapToDtos(List<Map<String, Object>> mapList, Class<T> clazz) throws Exception {
        ArrayList<T> resultList = new ArrayList<>();
        for (Map<String, Object> map : mapList) {
            T t = mapToDto(map, clazz);
            resultList.add(t);
        }
        return resultList;
    }

    private static <T> T mapToDto(Map<String, Object> map, Class<T> clazz) throws Exception {
        T instance = clazz.getDeclaredConstructor().newInstance();

        List<Field> fields = getAllFields(clazz, new ArrayList<>());
        for (Field field : fields) {
            if (!field.canAccess(instance)) {
                field.setAccessible(true);
            }
            Object mapValue = map.get(field.getName());
            if (mapValue != null) {
                field.set(instance, mapValue);
            }
        }
        
        return instance;
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
