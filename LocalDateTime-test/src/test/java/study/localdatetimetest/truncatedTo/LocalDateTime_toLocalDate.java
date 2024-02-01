package study.localdatetimetest.truncatedTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTime_toLocalDate {
    
    @DisplayName("LocalDateTime 으로 일,주,월,년 시작일, 종료일 구하기")
    @Test
    void truncatedTo_test() {

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate firstDayOfWeek = localDateTime.toLocalDate().with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        LocalDate lastDayOfWeek = localDateTime.toLocalDate().with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));

        System.out.println();
        System.out.println("이번주");
        System.out.println("firstDayOfWeek  = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek   = " + lastDayOfWeek);

        LocalDate firstDayOfMonth = localDateTime.toLocalDate().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfMonth = localDateTime.toLocalDate().with(TemporalAdjusters.lastDayOfMonth());

        System.out.println();
        System.out.println("이번달");
        System.out.println("firstDayOfMonth = " + firstDayOfMonth);
        System.out.println("lastDayOfMonth  = " + lastDayOfMonth);

        LocalDate firstDayOfYear = localDateTime.toLocalDate().with(TemporalAdjusters.firstDayOfYear());
        LocalDate lastDayOfYear = localDateTime.toLocalDate().with(TemporalAdjusters.lastDayOfYear());

        System.out.println();
        System.out.println("이번 년도");
        System.out.println("firstDayOfYear  = " + firstDayOfYear);
        System.out.println("lastDayOfYear   = " + lastDayOfYear);

    }
}
