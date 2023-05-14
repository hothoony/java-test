package study.localdatetimetest.test02_localdate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate_thisMonth_prevMonth_nextMonth {

    @Test
    void thisMonth() {
        String yyyyMM = DateTimeFormatter.ofPattern("yyyy-MM").format(LocalDate.now());
        System.out.println("thisMonth = " + yyyyMM);
    }

    @Test
    void prevMonth() {
        String yyyyMM = DateTimeFormatter.ofPattern("yyyy-MM").format(LocalDate.now().minusMonths(1));
        System.out.println("prevMonth = " + yyyyMM);
    }

    @Test
    void nextMonth() {
        String yyyyMM = DateTimeFormatter.ofPattern("yyyy-MM").format(LocalDate.now().plusMonths(1));
        System.out.println("nextMonth = " + yyyyMM);
    }
}
