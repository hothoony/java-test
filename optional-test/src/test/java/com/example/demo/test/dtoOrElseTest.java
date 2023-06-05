package com.example.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import java.util.Map;
import java.util.Optional;

public class dtoOrElseTest {

    @Test
    void test1() {
        HttpStatus httpStatus = null;
//        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        Integer status = (httpStatus != null) ? httpStatus.value() : null;
        System.out.println("status = " + status);
    }

    @Test
    void test2() {

        Map<String, Object> map = Map.of(
                "status", null, 
                "body", null
        );

        ResDto resDto = new ResDto((Integer) map.get("status"), map.get("body "));

        Integer num = (Integer) Optional.ofNullable(null).orElse(null);
        System.out.println("num = " + num);
    }
    
    static class ResDto {
        
        private Integer status;
        private Object body;

        public ResDto(Integer status, Object body) {
            this.status = status;
            this.body = body;
        }
    }
}
