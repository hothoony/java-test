package study.secretkeytest;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUID_test {

    @Test
    void test() {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(UUID.randomUUID());
        }
    }
}
