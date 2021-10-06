package util;

import java.time.LocalDate;

public class DateUtil {

    public static LocalDate getYesterday() {
        return LocalDate.now().plusDays(-1);
    }

    public static LocalDate getToday() {
        return LocalDate.now().plusDays(0);
    }

    public static LocalDate getTomorrow() {
        return LocalDate.now().plusDays(1);
    }
}