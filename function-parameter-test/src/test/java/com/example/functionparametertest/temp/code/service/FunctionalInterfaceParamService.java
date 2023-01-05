package com.example.functionparametertest.temp.code.service;

import com.example.functionparametertest.temp.code.fn_interface.Foo;

public class FunctionalInterfaceParamService {
    
    public String add(String str, Foo foo) {
        return foo.someMethod(str);
    }
}
