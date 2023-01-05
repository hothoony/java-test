package com.example.functiontest.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class Function_apply_Test {

    @Test
    void name() {
        
        Function<Integer, Integer> fn = x -> x * 2;
        
        Integer result = fn.apply(3);
        
        log.info("result = {}", result); // result = 6
    }
}
