package com.example.junit5example.junit5;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {

    @Test
    void test1() {

    }

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
