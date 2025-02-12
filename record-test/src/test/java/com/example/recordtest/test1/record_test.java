package com.example.recordtest.test1;

import com.example.recordtest.test1.code.Person;
import com.example.recordtest.test1.code.Tuple;
import org.junit.jupiter.api.Test;

public class record_test {

    @Test
    void test1() {
        // Tuple 사용시에 타입을 다르게 적용해서 사용할 수 있다
        Tuple<String, Integer> tuple1 = new Tuple<>("/wav/file/path", 42);
        System.out.println();
        System.out.println("first  = " + tuple1.first());
        System.out.println("second = " + tuple1.second());

        Tuple<Integer, Integer> tuple2 = new Tuple<>(30, 40);
        System.out.println();
        System.out.println("tuple2 = " + tuple2);

        Tuple<Integer, String> tuple3 = new Tuple<>(30, "40");
        System.out.println();
        System.out.println("tuple3 = " + tuple3);
    }

    @Test
    void test2() {
        Person person = new Person("james", 20);
        System.out.println(person.name());
        System.out.println(person.age());
    }
}
