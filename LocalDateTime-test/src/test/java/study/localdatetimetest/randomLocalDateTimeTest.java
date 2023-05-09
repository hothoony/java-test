package study.localdatetimetest;

import org.junit.jupiter.api.Test;

import static study.localdatetimetest.utils.LocalDateTimeUtil.randomLocalDate;
import static study.localdatetimetest.utils.LocalDateTimeUtil.randomLocalDateTime;

public class randomLocalDateTimeTest {

    @Test
    void randomLocalDate_test() {
        for (int i = 0; i < 10; i++) {
            System.out.println("randomLocalDate = " + randomLocalDate());
        }
    }

    @Test
    void randomLocalDateTime_test() {
        for (int i = 0; i < 10; i++) {
            System.out.println("randomLocalDateTime = " + randomLocalDateTime());
        }
    }
}
