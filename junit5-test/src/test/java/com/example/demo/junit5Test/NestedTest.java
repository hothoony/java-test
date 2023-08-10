package com.example.demo.junit5Test;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {

    @Test
    void test1() {

    }

    /**
     * 내부 클래스를 만들고 테스트 코드를 작성
     */
    @Nested
    class FindOne {
        @Test
        void findOne_byId() {

        }

        @Test
        void findOne_byName() {

        }
    }

    @Nested
    class Update {
        @Test
        void update_byId() {

        }

        @Test
        void update_byName() {

        }
    }
}
