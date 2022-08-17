package com.example.junit5example;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {

    /**
     * beforeAll, afterAll 은 테스트 메소드가 여러 개라도 한번만 실행된다
     * beforeEach, afterEach 는 각 테스트 메소드가 실행될 때 마다 실행된다
     */
    
    /**
     * beforeAll
     * 
     * beforeEach
     * test1
     * afterEach
     * 
     * beforeEach
     * test2
     * afterEach
     * 
     * afterAll
     */

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void test2() {
        System.out.println("test2");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }
}
