package study.localdatetimetest.test05_convert_to_date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class LocalDate_LocalDateTime_to_date {

    @Test
    void dteToLocalDateTime() {

        Date date = new Date();
        System.out.println("date               = " + date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("calendar.getTime() = " + calendar.getTime());

        LocalDate localDate = LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println("localDate          = " + localDate);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println("localDateTime      = " + localDateTime);
    }
}
