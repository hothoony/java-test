package org.study.filetest.file_test;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class file_test {

    @Test
    void test1() {
        String userHome = System.getProperty("user.home");
        System.out.println("userHome = " + userHome);
    }

    @Test
    void fileExist_io() {

        String BASE_DIR = System.getProperty("user.home") + "/uploads/";
        String filePath = BASE_DIR + "2025/04/01/voice_70900-1743461466231.wav";
        System.out.println("filePath = " + filePath);

        boolean isFileExist = isFileExist_withIO(filePath);
        System.out.println("isFileExist = " + isFileExist);
    }

    @Test
    void fileExist_nio() {

        String BASE_DIR = System.getProperty("user.home") + "/uploads/";
        String filePath = BASE_DIR + "2025/04/01/voice_70900-1743461466231.wav";
        System.out.println("filePath = " + filePath);

        boolean isFileExist = isFileExist_withNIO(filePath);
        System.out.println("isFileExist = " + isFileExist);
    }

    // nfs 경로에 있는 파일을 읽을 경우, nfs 캐시 문제가 있을 수 있으므로 2개를 조합해서 사용한다
    public boolean isFileExist(String filePath) {
        boolean exists = (new File(filePath)).exists();
        boolean readable = Files.isReadable(Paths.get(filePath));
        if (!exists && readable) {
            System.out.println("nfs 캐싱 문제일 수 있음");
        }
        return exists || readable;
    }

    public boolean isFileExist_withIO(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

    public boolean isFileExist_withNIO(String filePath) {
        Path path = Paths.get(filePath);
        return Files.isReadable(path);
    }
}
