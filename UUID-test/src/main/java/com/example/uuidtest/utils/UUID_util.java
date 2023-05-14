package com.example.uuidtest.utils;

import java.nio.ByteBuffer;
import java.util.UUID;

public class UUID_util {

    // UUID 를 16 byte 로 변환
    public static byte[] uuidToBytes(UUID uuid) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[16]);
        byteBuffer.putLong(uuid.getMostSignificantBits());
        byteBuffer.putLong(uuid.getLeastSignificantBits());
        return byteBuffer.array();
    }

    // 16 byte 를 UUID 로 변환
    public static UUID bytesToUUID(byte[] bytes) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        long high = byteBuffer.getLong();
        long low = byteBuffer.getLong();
        return new UUID(high, low);
    }
}
