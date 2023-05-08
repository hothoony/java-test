package study.localdatetimetest.ldt01_localtime;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.localdatetimetest.util.StringUtil;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

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

    private void printLocalTime(LocalTime localTime) {
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        String hh = StringUtil.lpad02(hour);
        String mm = StringUtil.lpad02(minute);
        String ss = StringUtil.lpad02(second);
        log.debug("{}:{}:{}", hh, mm, ss);
    }
}
