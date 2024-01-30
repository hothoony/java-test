package com.example.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class uploadPathTest {
    
    @Value("${uploadPath1}")
    private String uploadPath1; // /Users/ingpdev/uploadfiles

    @Value("${uploadPath2}")
    private String uploadPath2; // ../uploadfiles

    @Test
    void test1() {

        System.out.println("uploadPath1 = " + uploadPath1);
        System.out.println("uploadPath2 = " + uploadPath2);
    }
}
