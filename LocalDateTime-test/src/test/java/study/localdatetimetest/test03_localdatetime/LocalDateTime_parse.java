package study.localdatetimetest.test03_localdatetime;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static study.localdatetimetest.utils.LocalDateTimeUtil.*;

@Slf4j
public class LocalDateTime_parse {

    @Test
    void localTime_parse() {
        LocalTime localTime = LocalTime.parse("23:12:34");
        printLocalTime(localTime);
    }

    @Test
    void localDate_parse() {
        LocalDate localDate = LocalDate.parse("2023-12-31");
        printLocalDate(localDate);
    }

    @Test
    void localDateTime_parse() {
        LocalDateTime localDateTime = LocalDateTime.parse("2023-12-31T01:02:03");
        printLocalDateTime(localDateTime);
    }

    @Test
    void localDateTime_parse_pattern() {
        LocalDateTime localDateTime = LocalDateTime.parse("2023-12-31 01:02:03", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        printLocalDateTime(localDateTime);
    }

    @Test
    void localDateTime_parse_pattern2() {
        
        LocalDate localDate = LocalDate.parse("20231231", DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println("localDate = " + localDate);

        // localDate 을 localDateTime 으로 변환하기
        LocalDateTime localDateTime1 = localDate.atStartOfDay();
        System.out.println("localDateTime1 = " + localDateTime1);

        LocalDateTime localDateTime = LocalDateTime.parse("20231231" + " 000000", DateTimeFormatter.ofPattern("yyyyMMdd HHmmss"));
        System.out.println("localDateTime = " + localDateTime);
    }
}
