package com.example.demo.test;

import org.junit.jupiter.api.Test;

import java.util.Properties;

public class System_properties_test {
    
    @Test
    void test2() {

        /*
            user.country = KR
            user.dir = /Volumes/mydata/personal/github/java-test/system-properties-test
            user.home = /Users/ingpdev
            user.language = ko
            user.name = ingpdev
            user.timezone = Asia/Seoul
            user.variant = 
         */
        Properties properties = System.getProperties();
        for (Object o : properties.keySet()) {
            String key = String.valueOf(o);
            System.out.println(key + " = " + System.getProperty(key));
        }
    }
}
