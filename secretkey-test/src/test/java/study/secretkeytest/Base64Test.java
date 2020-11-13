package study.secretkeytest;

import org.junit.jupiter.api.Test;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class Base64Test {

    @Test
    void test() {
        String str = "wlfjw;lfja;lejkfa;lkfj;laj;l2q3f;lqnv;alk;flwejr23orjh2";
        System.out.println("str         : " + str);
        System.out.println("encoder     : " + new String(Base64.getEncoder().encode(str.getBytes())));
        System.out.println("urlEncoder  : " + new String(Base64.getUrlEncoder().encode(str.getBytes())));
        System.out.println("mimeEncoder : " + new String(Base64.getMimeEncoder().encode(str.getBytes())));
    }
}
