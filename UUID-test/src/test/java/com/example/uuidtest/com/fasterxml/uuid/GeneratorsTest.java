package com.example.uuidtest.com.fasterxml.uuid;

import com.fasterxml.uuid.Generators;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class GeneratorsTest {

    @Test
    void randomBasedGenerator() {
        UUID uuid = Generators.randomBasedGenerator().generate();
        System.out.println("uuid = " + uuid);
    }

    @Test
    void nameBasedGenerator() {
        UUID uuid = Generators.nameBasedGenerator().generate("hello");
        System.out.println("uuid = " + uuid);
    }

    @Test
    void timeBasedGenerator() {
        UUID uuid = Generators.timeBasedGenerator().generate();
        System.out.println("uuid = " + uuid);
    }
}
