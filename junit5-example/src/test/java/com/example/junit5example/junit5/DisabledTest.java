package com.example.junit5example.junit5;

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
