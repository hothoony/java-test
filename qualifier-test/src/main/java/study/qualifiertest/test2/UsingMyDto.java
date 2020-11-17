package study.qualifiertest.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsingMyDto {

    @Bean
    public MyDto myDto1() {
        return new MyDto("myDto1");
    }

    @Bean("myDto222")
    public MyDto myDto2() {
        return new MyDto("myDto2");
    }
}
