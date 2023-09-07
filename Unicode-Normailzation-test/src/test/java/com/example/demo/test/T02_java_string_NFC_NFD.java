package com.example.demo.test;

import org.apache.commons.text.StringEscapeUtils;
import org.junit.jupiter.api.Test;

import java.text.Normalizer;

public class T02_java_string_NFC_NFD {

    @Test
    void test() {
        
        String str = "한글"; // 자바에서 string 에 한글을 저장하면 NFC 로 저장된다
        System.out.println();
        System.out.println("01 origin str = " + str);
        System.out.println(StringEscapeUtils.escapeJava(str));
        
        str = Normalizer.normalize(str, Normalizer.Form.NFC);
        System.out.println();
        System.out.println("01 NFC str = " + str);
        System.out.println(StringEscapeUtils.escapeJava(str));

        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        System.out.println();
        System.out.println("01 NFD str = " + str);
        System.out.println(StringEscapeUtils.escapeJava(str));

//        str = Normalizer.normalize(str, Normalizer.Form.NFKC);
//        System.out.println();
//        System.out.println("01 NFKC str = " + str);
//        System.out.println(StringEscapeUtils.escapeJava(str));
//
//        str = Normalizer.normalize(str, Normalizer.Form.NFKD);
//        System.out.println();
//        System.out.println("01 NFKD str = " + str);
//        System.out.println(StringEscapeUtils.escapeJava(str));
    }
}
