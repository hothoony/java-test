package util;

import java.time.LocalDate;

public class DateUtil {

    public static LocalDate getYesterday() {
        return getLocalDate(-1);
    }

    public static LocalDate getToday() {
        return getLocalDate(0);
    }

    public static LocalDate getTomorrow() {
        return getLocalDate(1);
    }

    private static LocalDate getLocalDate(int dateDiff) {
        LocalDate today = LocalDate.now();
        return LocalDate.of(
                today.getYear(),
                today.getMonthValue(),
                today.getDayOfMonth() + dateDiff);
    }
}