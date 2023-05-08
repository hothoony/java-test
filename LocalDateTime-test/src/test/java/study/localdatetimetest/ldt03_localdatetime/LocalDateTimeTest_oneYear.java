package study.localdatetimetest.ldt03_localdatetime;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.localdatetimetest.util.StringUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

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

    private void printLocalDateTime(LocalDateTime localDateTime) {
        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        int date = localDateTime.getDayOfMonth();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        String yyyy = String.valueOf(year);
        String mm = StringUtil.lpad02(month);
        String dd = StringUtil.lpad02(date);
        String hh = StringUtil.lpad02(hour);
        String mi = StringUtil.lpad02(minute);
        String ss = StringUtil.lpad02(second);
        log.debug("{}-{}-{} {}:{}:{}", yyyy, mm, dd, hh, mi, ss);
        
    }
}
