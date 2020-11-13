package study.profileyamltest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
//@Profile("local")
public class AppInit {

    @Value("${my.server.config.description}")
    private String myServerConfigDesc;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println();
            System.out.println("myServerConfigDesc = " + myServerConfigDesc);
        };
    }
}
