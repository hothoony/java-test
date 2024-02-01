package study.localdatetimetest;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class statDateTest_day_week_month_year {
    
    // day, week, month, year

    @Test
    void day() {

        LocalDateTime beginDt = LocalDateTime.now();
        System.out.println("beginDt = " + beginDt);

        LocalDateTime truncSecond = beginDt.truncatedTo(ChronoUnit.SECONDS);
        System.out.println("truncSecond = " + truncSecond);
    }
}
