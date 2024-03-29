package com.example.uuidtest.test01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;

import static org.assertj.core.api.Assertions.*;

class UUID_test {

    @Test
    void test2() {
        UUID uuid = UUID.randomUUID();
        
        byte[] uuidBytes = new byte[16];
        ByteBuffer.wrap(uuidBytes)
                .order(ByteOrder.BIG_ENDIAN)
                .putLong(uuid.getMostSignificantBits())
                .putLong(uuid.getLeastSignificantBits())
        ;

        System.out.println("uuidBytes = " + Arrays.toString(uuidBytes));
        String str = new String(uuidBytes);
        System.out.println("str = " + str);
    }

    @Test
    void test1() {
        UUID uuid = UUID.randomUUID();

        // uuid.variant() = 2
        System.out.println("uuid.variant() = " + uuid.variant());
        
        // uuid.version() = 4
        System.out.println("uuid.version() = " + uuid.version());
    }

    @Test
    void length() {
        UUID uuid = UUID.randomUUID();

        // uuid = d785024b-a549-4c0b-891b-75a0dc58cc07
        System.out.println("uuid = " + uuid);
        
        // uuid.toString().length() = 36
        System.out.println("uuid.toString().length() = " + uuid.toString().length());
    }

    @Test
    void fromString_validTest() {
        String uuidStr = "36cfe541-19bb-45f1-8b35-d5a83a0303c7";
        UUID uuid = UUID.fromString(uuidStr);
        System.out.println("uuid = " + uuid);
        assertThat(uuid.toString()).isEqualTo(uuidStr);
    }

    @Test
    void fromString_invalidTest() {
        assertThatThrownBy(() -> {
            String uuidStr = "aa";
            UUID uuid = UUID.fromString(uuidStr);
            System.out.println("uuid = " + uuid);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
