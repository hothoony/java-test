package study.localdatetimetest.test03_localdatetime;

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
        
        dateTime = LocalDateTime.parse("2021-09-24 12:34", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println("dateTime = " + dateTime);
        
        dateTime = LocalDateTime.parse("2021-09-24 12:34:56", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("dateTime = " + dateTime);

        dateTime = LocalDateTime.parse("2021-09-24 12:34:56.789", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.println("dateTime = " + dateTime);

        dateTime = LocalDateTime.parse("2021-09-24 12:34:56.789012", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS"));
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

    @Test
    void format() {
        String result;

        result = DateTimeFormatter.ofPattern("yyyy").format(LocalDateTime.now());
        System.out.println("result = " + result);
        
        result = DateTimeFormatter.ofPattern("yyyy-MM").format(LocalDateTime.now());
        System.out.println("result = " + result);

        result = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now());
        System.out.println("result = " + result);

        result = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSS").format(LocalDateTime.now());
        System.out.println("result = " + result);

        result = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS").format(LocalDateTime.now());
        System.out.println("result = " + result);
    }
}
