package study.localdatetimetest.test01_localtime;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static study.localdatetimetest.utils.LocalDateTimeUtil.*;

@Slf4j
public class LocalTimeTest_oneHour {

    @Test
    void oneHour() {
        LocalTime localTime = LocalTime.of(0, 0, 0);
        for (int i = 0; i <= 3600; i++) {
            printLocalTime(localTime);
            localTime = localTime.plus(1, ChronoUnit.SECONDS);
        }
    }

}
