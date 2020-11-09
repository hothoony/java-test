package study.internalizationtest.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;

import java.util.Locale;

@Configuration
@RequiredArgsConstructor
public class AppInit {

    private final MessageSource messageSource;
    private MessageSourceAccessor messageSourceAccessor;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {

            System.out.println();
            System.out.println(messageSource.getMessage("hello.world", null, Locale.getDefault()));
            System.out.println(messageSource.getMessage("hello.world", null, Locale.US));
            System.out.println(messageSource.getMessage("hello.world", null, Locale.KOREA));

            System.out.println();
            System.out.println(messageSource.getMessage("i.like.color.and.food", new String[]{"핑크", "사과"}, Locale.getDefault()));
            System.out.println(messageSource.getMessage("i.like.color.and.food", new String[]{"PINK", "APPLE"}, Locale.US));
            System.out.println(messageSource.getMessage("i.like.color.and.food", new String[]{"핑크", "사과"}, Locale.KOREA));

            messageSourceAccessor = new MessageSourceAccessor(messageSource, Locale.US);
            System.out.println();
            System.out.println(messageSourceAccessor.getMessage("hello.world"));
            System.out.println(messageSourceAccessor.getMessage("i.like.color.and.food", new String[]{"PINK", "APPLE"}));

        };
    }
}
