package study.localdatetimetest.test03_localdatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_format {

    @Test
    void test1() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime no-format = " + localDateTime);
        
        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("localDateTime    format = " + format);
    }
}
