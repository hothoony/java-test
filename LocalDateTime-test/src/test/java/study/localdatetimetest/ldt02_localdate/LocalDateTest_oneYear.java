package study.localdatetimetest.ldt02_localdate;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.localdatetimetest.utils.LocalDateTimeUtil;
import study.localdatetimetest.utils.StringUtil;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static study.localdatetimetest.utils.LocalDateTimeUtil.*;

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

}
