package com.example.functiontest.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class Function_compose_Test {

    @Test
    void name() {

        Function<Integer, Double> add = n -> n + 2.0;
        Function<Double, Double> multiply = n -> n * 5.0;
        Function<Integer, Double> addAndMultiply = multiply.compose(add); // compose 로 Function 을 합쳐서 하나로 만든다

        Double result = addAndMultiply.apply(3);
        
        log.info("result = {}", result); // result = 25.0
    }
}
