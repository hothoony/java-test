package study.secretkeytest;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;

class SecretKeyGeneratorTest {

    private SecretKeyGenerator keyGenerator = new SecretKeyGenerator();

    @Test
    void test() throws NoSuchAlgorithmException {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(keyGenerator.hmacsha256());
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(keyGenerator.aes());
        }
    }

    @Test
    void test2() throws NoSuchAlgorithmException {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(keyGenerator.generate("HMACSHA256", Base64.getEncoder()));
            System.out.println(keyGenerator.generate("HMACSHA256", Base64.getUrlEncoder()));
            System.out.println(keyGenerator.generate("HMACSHA256", Base64.getMimeEncoder()));
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(keyGenerator.generate("AES", Base64.getEncoder()));
            System.out.println(keyGenerator.generate("AES", Base64.getUrlEncoder()));
            System.out.println(keyGenerator.generate("AES", Base64.getMimeEncoder()));
            System.out.println();
        }
    }
}
