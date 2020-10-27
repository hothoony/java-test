package com.example.junit5example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisplayNameDisabledTest {

    @Test
    @DisplayName("my test 1")
    void test1() {

    }

    @Test
    @Disabled
    void test2() {

    }

    @Test
    void test3() {

    }
}
