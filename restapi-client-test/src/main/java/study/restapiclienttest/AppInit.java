package study.restapiclienttest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import study.restapiclienttest.restClient.restTemplate.UsingRestTemplate_HttpClient;
import study.restapiclienttest.restClient.restTemplate.UsingRestTemplate;
import study.restapiclienttest.restClient.restTemplate.UsingRestTemplate_timeout;
import study.restapiclienttest.restClient.restTemplate.UsingRestTemplate_simple;
import study.restapiclienttest.restClient.webClient.UsingWebClient;
import study.restapiclienttest.restClient.webClient.UsingWebClient_timeout;
import study.restapiclienttest.restServer.Blocking_Nonblocking;

@Component
@RequiredArgsConstructor
public class AppInit {

    private final UsingRestTemplate usingRestTemplate;
    private final UsingRestTemplate_timeout usingRestTemplate_timeout;
    private final UsingRestTemplate_simple usingRestTemplate_simple;
    private final UsingRestTemplate_HttpClient usingRestTemplate_httpClient;
    private final UsingWebClient usingWebClient;
    private final UsingWebClient_timeout usingWebClient_timeout;

    private final Blocking_Nonblocking blocking_nonblocking;

    @Bean
    public CommandLineRunner run() {
        return args -> {
//            usingRestTemplate.callApi();
//            usingRestTemplate_timeout.callApi();
//            usingRestTemplate_simple.callApi();
//            usingRestTemplate_httpClient.callApi();
//            usingWebClient.callApi();
//            usingWebClient_timeout.callApi();

            blocking_nonblocking.blocking();
            blocking_nonblocking.nonBlocking();
        };
    }
}
