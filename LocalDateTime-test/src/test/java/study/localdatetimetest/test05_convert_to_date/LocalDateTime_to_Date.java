package study.localdatetimetest.test05_convert_to_date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTime_to_Date {

    @Test
    void convert_LocalDateTime_to_Date_test() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("date = " + date);
    }

    @Test
    void convert_LocalDate_to_Date_test() {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("date = " + date);
    }
}
