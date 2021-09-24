package study.localdatetimetest.util;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class LocalDateTimeUtil {
    
    public static boolean isWeekday(LocalDateTime localDateTime) {
        return isWeekend(localDateTime) == false;
    }

    public static boolean isWeekendByValue(LocalDateTime localDateTime) {
        List<Integer> range = Arrays.asList(6, 7);
        if (range.contains(localDateTime.getDayOfWeek().getValue())) {
            return true;
        }
        return false;
    }

    public static boolean isWeekend(LocalDateTime localDateTime) {
        List<DayOfWeek> range = Arrays.asList(
                DayOfWeek.SATURDAY,
                DayOfWeek.SUNDAY);

        if (range.contains(localDateTime.getDayOfWeek())) {
            return true;
        }
        return false;
    }
}
