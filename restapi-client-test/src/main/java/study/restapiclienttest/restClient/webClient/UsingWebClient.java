package study.restapiclienttest.restClient.webClient;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import study.restapiclienttest.restServer.RestConfig;

import java.time.Duration;

@Component
@RequiredArgsConstructor
public class UsingWebClient {

    private final WebClient webClient;

    public void callApi() {
        System.out.println();
        System.out.println("callApi UsingWebClient");
        System.out.println("webClient");

//        String response = webClient
//                .post()
//                .uri(RestServer.REST_SERVER_URL + "/hello")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block(Duration.ofMillis(RestConfig.TIMEOUT_MILLIS));
//        System.out.println("response = " + response);

        String response = webClient
                .post()
                .uri(RestConfig.SERVER_URL + "/hello")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer {token}")
                .retrieve()
                .bodyToFlux(String.class)
//                .timeout(Duration.ofMillis(RestConfig.TIMEOUT_MILLIS))
                .blockFirst();
        System.out.println("response = " + response);

//        Flux<String> flux = webClient
//                .post()
//                .uri(RestServer.REST_SERVER_URL + "/hello")
//                .contentType(MediaType.APPLICATION_JSON)
//                .header("Authorization", "Bearer {my-token}")
//                .bodyValue("{}")
//                .exchangeToFlux(response -> {
//                    System.out.println("statusCode = " + response.statusCode());
//                    ClientResponse.Headers headers = response.headers();
//                    System.out.println("contentType = " + headers.contentLength());
//                    return response.bodyToFlux(String.class);
//                });
//        System.out.println("flux = " + flux);
//        String str = flux.blockLast();
//        System.out.println("str = " + str);
    }
}
