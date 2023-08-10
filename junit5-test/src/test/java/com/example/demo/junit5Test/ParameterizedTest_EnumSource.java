package com.example.demo.junit5Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.temporal.ChronoUnit;

public class ParameterizedTest_EnumSource {

    @ParameterizedTest
    @EnumSource(names = {"DAYS", "HOURS"})
    void names(ChronoUnit chronoUnit) {
        System.out.println("chronoUnit = " + chronoUnit);
    }
}
