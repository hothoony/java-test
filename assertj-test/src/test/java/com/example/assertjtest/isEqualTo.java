package com.example.assertjtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class isEqualTo {

    @Test
    void string() {
        String str = "Spring";
        
        assertThat(str)
                .isEqualTo("Spring")
                .isEqualToIgnoringCase("spring");
    }

    @Test
    void number() {
        int num = 123;
        
        assertThat(num).isEqualTo(123);
    }
    
}
