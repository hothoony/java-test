package com.example.recordtest.test1;

import org.junit.jupiter.api.Test;

public class record_test {

    @Test
    void test1() {
        MyService.Tuple<String, Integer> tuple = new MyService.Tuple<>("/wav/file/path", 42);
        System.out.println(tuple.name());
        System.out.println(tuple.age());
    }

    @Test
    void test2() {
        MyService.Person person = new MyService.Person("james", 20);
        System.out.println(person.name);
        System.out.println(person.age);
    }

    public static class MyService {

        record Person(String name, int age) {}

        record Tuple<C, D>(C name, D age) {}
    }
}
