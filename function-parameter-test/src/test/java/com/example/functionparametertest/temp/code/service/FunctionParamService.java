package com.example.functionparametertest.temp.code.service;

import java.util.function.Function;

public class FunctionParamService {
    
    public String add(String str, Function<String, String> fn) {
        return fn.apply(str);
    }
}
