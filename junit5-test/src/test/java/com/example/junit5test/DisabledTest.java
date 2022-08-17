package com.example.junit5test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisabledTest {

    @Test
    @Disabled
    @DisplayName("@Disabled 애노테이션이 붙은 테스트는 실행하지 않는다")
    void test2() {

    }

    @Test
    void test3() {

    }
}
