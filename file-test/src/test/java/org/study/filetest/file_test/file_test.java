package org.study.filetest.file_test;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;

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

    public boolean isFileExist(String filePath) {
        boolean exists = (new File(filePath)).exists();
        boolean readable = Files.isReadable(Paths.get(filePath));
        boolean exists2 = Files.exists(Paths.get(filePath));
        if (!exists && readable) {
            System.out.println("nfs 캐싱 문제일 수 있음");
        }
        return exists || readable || exists2;
    }

    public boolean isFileExist2(String filePath) {
        Path path = Paths.get(filePath);

        if (Files.exists(path)) {
            return true;
        }

        // 파일이 존재하지 않는다고 판단되면 추가 검사
        try {
            // 메타데이터 강제 갱신을 위한 시도
            Files.getFileAttributeView(path, BasicFileAttributeView.class)
                    .readAttributes();

            // 다시 존재 여부 확인
            boolean existsAfterRefresh = Files.exists(path);
            if (existsAfterRefresh) {
                System.out.println("NFS 캐싱 문제 감지: 메타데이터 새로고침 후 파일 발견 => " + filePath);
            }
            return existsAfterRefresh;
        } catch (IOException e) {
            // 속성을 읽을 수 없는 경우 - 파일이 정말로 존재하지 않음
            return false;
        }
    }

    public boolean isFileExist_withIO(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

    public boolean isFileExist_withNIO(String filePath) {
        Path path = Paths.get(filePath);
        return Files.isReadable(path);
    }

    public boolean isFileExist_withNIO2(String filePath) {
        Path path = Paths.get(filePath);
        return Files.exists(path);
    }
}
