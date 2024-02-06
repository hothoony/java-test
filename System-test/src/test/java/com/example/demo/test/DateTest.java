package com.example.demo.test;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class DateTest {

    @Test
    void test1() {

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println("year   = " + year);
        System.out.println("month  = " + month);
        System.out.println("date   = " + date);
        System.out.println("hour   = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("second = " + second);

        String yyyy = String.valueOf(year);
        String mm = lpadNum2(String.valueOf(month));
        String dd = lpadNum2(String.valueOf(date));
        String hh = lpadNum2(String.valueOf(hour));
        String mi = lpadNum2(String.valueOf(minute));
        String ss = lpadNum2(String.valueOf(second));

        String yyyymmddhhmiss = yyyy + mm + dd + hh + mi + ss;
        System.out.println("yyyymmddhhmiss = " + yyyymmddhhmiss);

        String randomNum = Utils.randomNumber(6);
        System.out.println("randomNum = " + randomNum);

        System.out.println("filename = " + yyyymmddhhmiss + "_" + randomNum + ".pdf");
    }

    private String lpadNum2(Object object) {
        String str = String.valueOf(object);
        while (str.length() < 2) {
            str = "0" + str;
        }
        return str;
    }
}
