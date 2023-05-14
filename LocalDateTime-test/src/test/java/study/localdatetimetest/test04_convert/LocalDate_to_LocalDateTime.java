package study.localdatetimetest.test04_convert;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_to_LocalDateTime {

    @Test
    void test1() {
        LocalDate localDate = LocalDate.parse("2023-05-31", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDateTimeBgn = localDate.atStartOfDay();
        LocalDateTime localDateTimeEnd = localDate.atTime(LocalTime.MAX);
        
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTimeBgn = " + localDateTimeBgn);
        System.out.println("localDateTimeEnd = " + localDateTimeEnd);
    }
}
