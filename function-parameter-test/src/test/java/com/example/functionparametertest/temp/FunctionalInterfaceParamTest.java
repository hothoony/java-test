package com.example.functionparametertest.temp;

import com.example.functionparametertest.temp.code.service.FunctionalInterfaceParamService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class FunctionalInterfaceParamTest {
    
    FunctionalInterfaceParamService service = new FunctionalInterfaceParamService();

    @Test
    void test() {
        String result = service.add("hello", param -> param + " world");
        log.info("result = {}", result);
    }
}
