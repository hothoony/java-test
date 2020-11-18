package study.restapiclienttest.config;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import study.restapiclienttest.restServer.RestConfig;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
//        return WebClient.create(RestServer.REST_SERVER_URL);
//        return WebClient.builder().baseUrl(RestServer.REST_SERVER_URL).build();
        return WebClient.builder().build();
    }

    @Bean
    public WebClient webClient_timeout() {
        HttpClient httpClient = HttpClient.create()
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, RestConfig.TIMEOUT_MILLIS)
                .doOnConnected(conn -> conn
                        .addHandlerLast(new ReadTimeoutHandler(RestConfig.TIMEOUT_MILLIS, TimeUnit.MILLISECONDS))
                        .addHandlerLast(new WriteTimeoutHandler(RestConfig.TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)));

        return WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .build();
    }
}
