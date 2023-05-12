package com.example.snakecasecamelcasetest.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SnakeCamelCaseUtil {

    public static String snakeToCamel(String text) {
        String regex = "_?[^_]+";
        Matcher matcher = Pattern.compile(regex).matcher(text.toLowerCase());
        String result = matcher.replaceAll(m -> {
            String str = m.group().replace("_", "");
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        });
        return result.substring(0, 1).toLowerCase() + result.substring(1);
    }

    public static String camelToSnake(String text) {
        String regex = "([A-Z])";
        Matcher matcher = Pattern.compile(regex).matcher(text);
        return matcher.replaceAll(m -> "_" + m.group().toLowerCase());
    }

}
