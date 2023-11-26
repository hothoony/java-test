package study.lomboktest.test;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.springframework.util.Assert.*;

public class RequiredFieldTest {

    @Test
    void personTest() {

        Person person = Person.builder()
//                .name("james")
                .build();
        System.out.println("person = " + person);

    }

    @Test
    void companyTest() {

        Company company = Company.builder()
                .build();
        System.out.println("company = " + company);
    }

    @Builder
    @Data
    static class Person {

        @NonNull
        private String name;
        private Integer age;
    }

    @Data
    static class Company {

        private String name;
        private Integer brno;

        @Builder
        public Company(String name) {
//            notNull(name);
            this.name = name;
        }
    }
}
