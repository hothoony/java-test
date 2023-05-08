package study.localdatetimetest.ldt02_localdate;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.localdatetimetest.util.StringUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

@Slf4j
public class LocalDateTest_oneYear {

    @Test
    void oneHour() {
        LocalDate localDate = LocalDate.of(2023, 1, 1);
        for (int i = 0; i <= 365; i++) {
            printLocalDate(localDate);
            localDate = localDate.plus(1, ChronoUnit.DAYS);
        }
    }

    private void printLocalDate(LocalDate localDate) {
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int date = localDate.getDayOfMonth();
        String yyyy = String.valueOf(year);
        String mm = StringUtil.lpad02(month);
        String dd = StringUtil.lpad02(date);
        log.debug("{}-{}-{}", yyyy, mm, dd);
    }
}
