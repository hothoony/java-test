package study.restapiclienttest.restClient.webClient;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import study.restapiclienttest.restServer.RestConfig;

@Component
@RequiredArgsConstructor
public class UsingWebClient_timeout {

    private final WebClient webClient_timeout;

    public void callApi() {
        System.out.println();
        System.out.println("callApi UsingWebClient");
        System.out.println("webClient_timeout");

//        String response = webClient_timeout
//                .post()
//                .uri(RestServer.REST_SERVER_URL + "/hello")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block(Duration.ofMillis(RestConfig.TIMEOUT_MILLIS));
//        System.out.println("response = " + response);

        String response = webClient_timeout
                .post()
                .uri(RestConfig.SERVER_URL + "/hello")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer {token}")
                .retrieve()
                .bodyToFlux(String.class)
                .blockFirst();
        System.out.println("response = " + response);

//        Flux<String> flux = webClient_timeout
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
