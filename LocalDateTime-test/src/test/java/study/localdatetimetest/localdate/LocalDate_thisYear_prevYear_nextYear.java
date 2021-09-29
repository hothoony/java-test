package study.localdatetimetest.localdate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate_thisYear_prevYear_nextYear {

    @Test
    void thisYear() {
        String yyyyMM = DateTimeFormatter.ofPattern("yyyy").format(LocalDate.now());
        System.out.println("thisYear  = " + yyyyMM);
    }

    @Test
    void prevYear() {
        String yyyyMM = DateTimeFormatter.ofPattern("yyyy").format(LocalDate.now().minusYears(1));
        System.out.println("prevYear  = " + yyyyMM);
    }

    @Test
    void nextYear() {
        String yyyyMM = DateTimeFormatter.ofPattern("yyyy").format(LocalDate.now().plusYears(1));
        System.out.println("nextYear  = " + yyyyMM);
    }
}
