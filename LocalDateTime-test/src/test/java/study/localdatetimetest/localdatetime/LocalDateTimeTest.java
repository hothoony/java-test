package study.localdatetimetest.localdatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

    @Test
    void now() {
        // 2021-09-24T16:35:00.180178
        System.out.println(LocalDateTime.now());
    }

    @Test
    void now_loop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(LocalDateTime.now());
        }
    }

    @Test
    void parse() {
        LocalDateTime dateTime = null;
        
        dateTime = LocalDateTime.parse("2021-09-24 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("dateTime = " + dateTime);

        dateTime = LocalDateTime.parse("2021-09-24 00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println("dateTime = " + dateTime);
    }

    @Test
    void of() {
        LocalDateTime dateTime = null;
        
        dateTime = LocalDateTime.of(2021, 9, 24, 0, 0);
        System.out.println("dateTime = " + dateTime);

        dateTime = LocalDateTime.of(2021, 9, 24, 0, 0, 0);
        System.out.println("dateTime = " + dateTime);

        dateTime = LocalDateTime.of(2021, 9, 24, 0, 0, 0, 0);
        System.out.println("dateTime = " + dateTime);
    }
}
