package com.example.functiontest.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class Function_andThen_Test {

    @Test
    void name() {
        
        Function<Integer, Integer> fn1 = x -> x * 2;
        Function<Integer, String> fn2 = x -> "result = " + x;

        String result = fn1.andThen(fn2).apply(3);

        log.info("RESULT => {}", result); // RESULT => result = 6
    }
}
