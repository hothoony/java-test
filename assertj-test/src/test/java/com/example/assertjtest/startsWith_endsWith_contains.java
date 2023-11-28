package com.example.assertjtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class startsWith_endsWith_contains {

    @Test
    void contains() {
        String str = "Spring Boot JPA Gradle";
        assertThat(str)
                .startsWith("Spring")
                .contains("Boot")
                .containsIgnoringCase("jpa")
                .containsWhitespaces()
                .endsWith("Gradle");
    }
}
