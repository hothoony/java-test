package com.example.junit5example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisabledTest {

    @Test
    @Disabled
    void test2() {

    }

    @Test
    void test3() {

    }
}
