package study.localdatetimetest.truncatedTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTime_truncatedTo {
    
    @DisplayName("LocalDateTime 에서 원하는 부분까지만 표시하기")
    @Test
    void truncatedTo_test() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime truncNanos = localDateTime.truncatedTo(ChronoUnit.NANOS);
        System.out.println("truncNanos    = " + truncNanos);

        LocalDateTime truncMillis = localDateTime.truncatedTo(ChronoUnit.MILLIS);
        System.out.println("truncMillis   = " + truncMillis);

        LocalDateTime truncSecond = localDateTime.truncatedTo(ChronoUnit.SECONDS);
        System.out.println("truncSecond   = " + truncSecond);

        LocalDateTime truncMinute = localDateTime.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("truncMinute   = " + truncMinute);

        LocalDateTime truncHour = localDateTime.truncatedTo(ChronoUnit.HOURS);
        System.out.println("truncHour     = " + truncHour);

        LocalDateTime truncDay = localDateTime.truncatedTo(ChronoUnit.DAYS);
        System.out.println("truncDay      = " + truncDay);
        
        // 아래 코드는 에러 남
        // java.time.temporal.UnsupportedTemporalTypeException: Unit is too large to be used for truncation

//        LocalDateTime truncWeek = localDateTime.truncatedTo(ChronoUnit.WEEKS);
//        System.out.println("truncWeek = " + truncWeek);

//        LocalDateTime truncMonth = localDateTime.truncatedTo(ChronoUnit.MONTHS);
//        System.out.println("truncMonth = " + truncMonth);

//        LocalDateTime truncYear = localDateTime.truncatedTo(ChronoUnit.YEARS);
//        System.out.println("truncYear = " + truncYear);

    }
}
