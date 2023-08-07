package com.example.mockitotest.utils;

public class CommonUtil {

    public static boolean isBlank(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }

    private static boolean hasValue(String str) {
        return !isBlank(str);
    }
}
