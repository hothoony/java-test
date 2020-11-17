package study.qualifiertest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import study.qualifiertest.test1.Test1;
import study.qualifiertest.test2.Test2;

@Component
@RequiredArgsConstructor
public class AppInit {

    private final Test1 test1;
    private final Test2 test2;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            test1.test();
            test2.test();
        };
    }
}
