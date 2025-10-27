package com.example.listtest.test1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.*;

public class LocalDate_between_test {
    
    @Test
    void isBetween1_test() {
        assertThat(isBetween1("20251012", "20251011", "20251013")).isTrue();
        assertThat(isBetween1("20251012", "20251011", "20251012")).isTrue();
        assertThat(isBetween1("20251012", "20251012", "20251013")).isTrue();
    }

    @Test
    void isBetween2_test() {
        assertThat(isBetween2("20251012", "20251011", "20251013")).isTrue();
        assertThat(isBetween2("20251012", "20251011", "20251012")).isTrue();
        assertThat(isBetween2("20251012", "20251012", "20251013")).isTrue();
    }

    boolean isBetween1(String basedt, String stdate, String endate) {
        LocalDate baseDate = LocalDate.parse(basedt, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate startDate = LocalDate.parse(stdate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate endDate = LocalDate.parse(endate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        if ((baseDate.equals(startDate) || baseDate.isAfter(startDate)) && (baseDate.equals(endDate) || baseDate.isBefore(endDate))) {
            return true;
        }
        return false;
    }

    boolean isBetween2(String basedt, String stdate, String endate) {
        LocalDate baseDate = LocalDate.parse(basedt, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate startDate = LocalDate.parse(stdate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate endDate = LocalDate.parse(endate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        if (!baseDate.isBefore(startDate) && !baseDate.isAfter(endDate)) {
            return true;
        }
        return false;
    }
}
