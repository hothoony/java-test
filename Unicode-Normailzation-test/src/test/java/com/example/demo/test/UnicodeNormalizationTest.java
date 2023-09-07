package com.example.demo.test;

import org.apache.commons.text.StringEscapeUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.Normalizer;

public class UnicodeNormalizationTest {

    @Test
    void test() {
        
        File[] files = {
                new File("/Users/ingpdev/xtemp/nfc_nfd_test/10.UTF-8 NFD 한글.txt"),
                new File("/Users/ingpdev/xtemp/nfc_nfd_test/20.UTF-8 NFC 한글.txt"),
                new File("/Users/ingpdev/xtemp/nfc_nfd_test/30.한글.txt")
        };

        for (File file : files) {
            check_NFC_NFD(file);
        }
    }

    private static void check_NFC_NFD(File file) {
        
        boolean isNFD = Normalizer.isNormalized(file.getName(), Normalizer.Form.NFD);
        boolean isNFC = Normalizer.isNormalized(file.getName(), Normalizer.Form.NFC);

        System.out.println();
        System.out.println(file.getName());
        System.out.println(StringEscapeUtils.escapeJava(file.getName()));
        System.out.println("isNFD = " + isNFD);
        System.out.println("isNFC = " + isNFC);
    }

    @Test
    void renameTest() throws IOException {

        File file = new File("/Users/ingpdev/xtemp/nfc_nfd_test/10.UTF-8 NFD 한글.txt");
        
        String path = file.getParentFile().getPath() + "/";
        System.out.println("path = " + path);
        
        String filename = file.getName();
        System.out.println();
        System.out.println("filename = " + filename);
        System.out.println(StringEscapeUtils.escapeJava(filename));

        filename = Normalizer.normalize(filename, Normalizer.Form.NFD);
        System.out.println();
        System.out.println("filename = " + filename);
        System.out.println(StringEscapeUtils.escapeJava(filename));

        file.renameTo(new File(path + filename));
    }
}
