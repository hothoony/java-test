package com.example.uuidtest.com.fasterxml.uuid;

import com.fasterxml.uuid.Generators;
import org.junit.jupiter.api.Test;

public class nameBasedGeneratorTest {

    @Test
    void nameBasedGenerator() {
        
        String name1 = "hello";
        System.out.println();
        System.out.println("name1 = " + name1);
        System.out.println("uuid = " + Generators.nameBasedGenerator().generate(name1));
        System.out.println("uuid = " + Generators.nameBasedGenerator().generate(name1));
        
        String name2 = "world";
        System.out.println();
        System.out.println("name2 = " + name2);
        System.out.println("uuid = " + Generators.nameBasedGenerator().generate(name2));
        System.out.println("uuid = " + Generators.nameBasedGenerator().generate(name2));
    }
}
