package study.localdatetimetest.utils;

import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Slf4j
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

    public static void printLocalTime(LocalTime localTime) {
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        String hh = StringUtil.lpad02(hour);
        String mi = StringUtil.lpad02(minute);
        String ss = StringUtil.lpad02(second);
        log.debug("{}:{}:{}", hh, mi, ss);
    }

    public static void printLocalDate(LocalDate localDate) {
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int date = localDate.getDayOfMonth();
        String yyyy = String.valueOf(year);
        String mm = StringUtil.lpad02(month);
        String dd = StringUtil.lpad02(date);
        log.debug("{}-{}-{}", yyyy, mm, dd);
    }

    public static void printLocalDateTime(LocalDateTime localDateTime) {
        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        int date = localDateTime.getDayOfMonth();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        String yyyy = String.valueOf(year);
        String mm = StringUtil.lpad02(month);
        String dd = StringUtil.lpad02(date);
        String hh = StringUtil.lpad02(hour);
        String mi = StringUtil.lpad02(minute);
        String ss = StringUtil.lpad02(second);
        log.debug("{}-{}-{} {}:{}:{}", yyyy, mm, dd, hh, mi, ss);
    }

    public static LocalDate randomLocalDate() {
        LocalDate localDate = LocalDate.of(2023, 1, 1);
        localDate = localDate.plusDays(randomBetween(0, 365));
        return localDate;
    }

    public static LocalDateTime randomLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
        localDateTime = localDateTime.plusDays(randomBetween(0, 365));
        localDateTime = localDateTime.plusHours(randomBetween(0, 23));
        localDateTime = localDateTime.plusMinutes(randomBetween(0, 59));
        localDateTime = localDateTime.plusSeconds(randomBetween(0, 59));
        return localDateTime;
    }

    private static int randomBetween(int start, int end) {
        return (int) ((Math.random() * (end - start + 1)) + start);
    }
}
