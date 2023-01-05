package com.example.functionparametertest.temp;

import com.example.functionparametertest.temp.code.service.FunctionParamService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class FunctionParamServiceTest {

    FunctionParamService service = new FunctionParamService();
        
    @Test
    void test() {
        String result = service.add("hello", param -> param + " world");
        log.info("result = {}", result);
    }
}
