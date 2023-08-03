package com.example.demo.test;

import org.junit.jupiter.api.Test;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

class URLEncoder_test {

    static final String UTF_8 = "UTF-8";
    static final String EUC_KR = "EUC-KR";

    @Test
    void test1() {
        
        String ori_str = "하나UBSKTOP단기금융채액티브증권상장지수투자신탁[채권]";
        System.out.println("ori_str = " + ori_str);

        System.out.println();
        encode_decode_without_charset(ori_str);

        System.out.println();
        encode_decode_with_charset(ori_str, EUC_KR);

        System.out.println();
        encode_decode_with_charset(ori_str, UTF_8);
    }

    private static void encode_decode_with_charset(String str, String charsetName) {
        System.out.println("charsetName = " + charsetName);
        String encoded = URLEncoder.encode(str, Charset.forName(charsetName));
        System.out.println("encoded = " + encoded);
        String decoded = URLDecoder.decode(encoded, Charset.forName(charsetName));
        System.out.println("decoded = " + decoded);
    }

    private static void encode_decode_without_charset(String str) {
        String encoded = URLEncoder.encode(str);
        System.out.println("encoded = " + encoded);
        String decoded = URLDecoder.decode(encoded);
        System.out.println("decoded = " + decoded);
    }
}
