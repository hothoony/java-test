package study.localdatetimetest;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class randomDateTest_LocalDate {

    @Test
    void test1() {

        LocalDate startDate = LocalDate.parse("20230101", DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate endDate = LocalDate.parse("20241231", DateTimeFormatter.ofPattern("yyyyMMdd"));

        for (int i = 0; i < 100; i++) {
            LocalDate randomDate = getRandomDate(startDate, endDate);
            System.out.println("randomDate = " + randomDate);
        }
    }
    
    public LocalDate getRandomDate(LocalDate startDate, LocalDate endDate) {
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        Random random = new Random();
        int randomDays = random.nextInt((int) daysBetween + 1);
        return startDate.plusDays(randomDays);
    }
    
}
