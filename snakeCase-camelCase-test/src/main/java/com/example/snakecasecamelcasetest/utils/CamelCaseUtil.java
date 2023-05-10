package com.example.snakecasecamelcasetest.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCaseUtil {

    public static String snakeToCamel(String str) {
        Pattern pattern = Pattern.compile("_?[^_]+");
        Matcher matcher = pattern.matcher(str.toLowerCase());
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (matcher.find()) {
            String group = matcher.group();
            group = group.replace("_", "");
            if (index > 0) {
                group = group.substring(0, 1).toUpperCase() + group.substring(1);
            }
            sb.append(group);
            index++;
        }
        return sb.toString();
    }

}
