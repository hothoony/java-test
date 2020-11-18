package study.restapiclienttest.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import study.restapiclienttest.restServer.RestConfig;

import java.time.Duration;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .build();
    }

    @Bean
    public RestTemplate restTemplate_timeout(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMillis(RestConfig.TIMEOUT_MILLIS))
                .setReadTimeout(Duration.ofMillis(RestConfig.TIMEOUT_MILLIS))
                .build();
    }

    @Bean
    public RestTemplate restTemplate_simple() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(RestConfig.TIMEOUT_MILLIS);
        factory.setReadTimeout(RestConfig.TIMEOUT_MILLIS);
        return new RestTemplate(factory);
    }

    @Bean
    public RestTemplate restTemplate_HttpClient() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectionRequestTimeout(RestConfig.TIMEOUT_MILLIS);
        factory.setConnectTimeout(RestConfig.TIMEOUT_MILLIS);
        factory.setReadTimeout(RestConfig.TIMEOUT_MILLIS);
        return new RestTemplate(factory);
    }
}
