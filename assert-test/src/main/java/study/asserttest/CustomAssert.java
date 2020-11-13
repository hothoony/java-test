package study.asserttest;

import org.springframework.util.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CustomAssert extends Assert {

    public static void validDate(String yyyymmdd, String message) {
        try {
            LocalDate.parse(yyyymmdd, DateTimeFormatter.BASIC_ISO_DATE);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(message + ": " + yyyymmdd);
        }
    }

}
