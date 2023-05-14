package study.localdatetimetest.test03_localdatetime;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static study.localdatetimetest.utils.LocalDateTimeUtil.*;

@Slf4j
public class LocalDateTimeTest_oneYear {

    @Test
    void oneHour() {
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2023, 1, 1), LocalTime.of(0, 0, 0));
        int count = 2 * 24 * 365;
        for (int i = 0; i <= count; i++) {
            printLocalDateTime(localDateTime);
            localDateTime = localDateTime.plus(30, ChronoUnit.MINUTES);
        }
    }

}
