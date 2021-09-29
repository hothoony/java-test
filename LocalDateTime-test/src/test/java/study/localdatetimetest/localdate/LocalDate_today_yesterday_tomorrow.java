package study.localdatetimetest.localdate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LocalDate_today_yesterday_tomorrow {

    @Test
    void today() {
        LocalDate now = LocalDate.now();
        System.out.println("today     = " + now);
    }

    @Test
    void yesterday() {
        LocalDate now = LocalDate.now().minusDays(1);
        System.out.println("yesterday = " + now);
    }

    @Test
    void tomorrow() {
        LocalDate now = LocalDate.now().plusDays(1);
        System.out.println("tomorrow  = " + now);
    }
}
