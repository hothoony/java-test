package study.asserttest;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static org.assertj.core.api.Assertions.assertThat;

class CustomAssertTest {

    public static final String MESSAGE_ON_INVALID = "assert failed";

    @Test
    void test() {
        String NUMBERIC_ONLY = "[\\d]+";
        System.out.println("123".matches(NUMBERIC_ONLY));

//        String BIZ_NUMBER = "(\\d{3})-(\\d{2})-(\\d{5})";
        String BIZ_NUMBER = "\\d{3}-\\d{2}-\\d{5}";
        System.out.println("111-22-33333".matches(BIZ_NUMBER));
    }

    @Test
    void validDate() {
        CustomAssert.validDate("20200229", MESSAGE_ON_INVALID);
        CustomAssert.validDate("20200230", MESSAGE_ON_INVALID);
    }
}
