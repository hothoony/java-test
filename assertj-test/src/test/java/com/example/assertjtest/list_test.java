package com.example.assertjtest;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class list_test {

    @Test
    void list_size_0() {
        List<Model> list = new ArrayList<>();

        assertThat(list)
                .hasSize(0)
                .isNotNull()
                .isEmpty()
        ;
    }

    @Test
    void list_size_greator_than_0() {
        List<Model> list = Arrays.asList(
                new Model(1, "java"),
                new Model(2, "spring"),
                new Model(3, "gradle")
        );

        assertThat(list)
                .isNotEmpty()
                .hasSize(3)
                .doesNotHaveDuplicates();

        assertThat(list).extracting("id").containsExactly(1, 2, 3);
        assertThat(list).extracting("name").containsExactly("java", "spring", "gradle");

        assertThat(list).extracting("id").contains(3, 2);
        assertThat(list).extracting("name").contains("spring", "java");
    }

    static class Model {
        
        private int id;
        private String name;

        public Model(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
