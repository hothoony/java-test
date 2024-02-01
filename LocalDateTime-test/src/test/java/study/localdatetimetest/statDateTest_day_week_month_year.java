package study.localdatetimetest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class statDateTest_day_week_month_year {
    
    @DisplayName("localDate 로 일,주,월,년 구하기")
    @Test
    void test1() {

        // day, week, month, year

//        LocalDate localDate = LocalDate.now();
        LocalDate localDate = LocalDate.parse("20230506", DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println("localDate = " + localDate);

        LocalDate weekBgn = localDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        LocalDate weekEnd = localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println();
        System.out.println("weekBgn   = " + weekBgn);
        System.out.println("weekEnd   = " + weekEnd);

        LocalDate monthBgn = localDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate monthEnd = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println();
        System.out.println("monthBgn  = " + monthBgn);
        System.out.println("monthEnd  = " + monthEnd);

        LocalDate yearBgn = localDate.with(TemporalAdjusters.firstDayOfYear());
        LocalDate yearEnd = localDate.with(TemporalAdjusters.lastDayOfYear());
        System.out.println();
        System.out.println("yearBgn   = " + yearBgn);
        System.out.println("yearEnd   = " + yearEnd);
    }
}
