package com.example.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.InputStreamResource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Files_test {

    @Test
    void test1() throws IOException {
        Path path = Paths.get("./img/cat.png");
        File file = path.toFile();
        System.out.println("file.exists() = " + file.exists());
        InputStreamResource inputStreamResource = new InputStreamResource(Files.newInputStream(path));
    }
}
