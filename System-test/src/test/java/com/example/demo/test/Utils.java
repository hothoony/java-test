package com.example.demo.test;

public class Utils {

    public static String randomNumber(int len) {
        String random = String.valueOf(Math.random());
        int afterDot = random.indexOf(".") + 1;
        return random.substring(afterDot, afterDot + len);
    }
}
