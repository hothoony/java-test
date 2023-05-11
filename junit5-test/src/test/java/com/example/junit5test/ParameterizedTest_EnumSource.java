package com.example.junit5test;

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
