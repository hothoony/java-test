package study.lomboktest.test;

import lombok.Builder;
import lombok.Data;
import org.junit.jupiter.api.Test;

public class builder_test {

    @Test
    void test1() {
        RequestDto requestDto = RequestDto.builder()
                .name("name")
                .email("email@email.com")
                .age(20)
                .build();
        System.out.println("requestDto = " + requestDto);

        RequestDto.builder()
                .email("email@email.com")
                .build();
    }

    @Builder
    @Data
    static class RequestDto {
        private String name;
        private String email;
        private Integer age;

//        @Builder
        public RequestDto(String email) {
            this.email = email;
        }
    }
}
