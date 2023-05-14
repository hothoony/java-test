package com.example.uuidtest.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class UUID_utilTest {

    @Test
    void test() {
        
        UUID uuid1 = UUID.randomUUID();
        System.out.println("uuid1 = " + uuid1);
        
        // uuidToBytes
        byte[] bytes = UUID_util.uuidToBytes(uuid1);
        System.out.println("bytes = " + Arrays.toString(bytes));   

        // bytesToUUID
        UUID uuid2 = UUID_util.bytesToUUID(bytes);
        System.out.println("uuid2 = " + uuid2);

        assertThat(uuid1).isEqualTo(uuid2);
        assertThat(uuid1.toString()).isEqualTo(uuid2.toString());
    }
}
