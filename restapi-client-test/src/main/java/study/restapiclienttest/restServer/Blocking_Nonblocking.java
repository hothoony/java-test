package study.restapiclienttest.restServer;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RestController
public class Blocking_Nonblocking {

    @GetMapping("/blocking")
    public void blocking() {
        System.out.println();
        System.out.println("Start BLOCKING");

        String body = "{}";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth("{my-token}");

        HttpEntity<String> httpEntity = new HttpEntity<>(body, headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(
                "http://localhost:8090/hello",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<String>() {});

        String responseBody = response.getBody();
        System.out.println(responseBody);
        System.out.println("End   BLOCKING");
    }

    @GetMapping("/non-blocking")
    public void nonBlocking() {
        System.out.println("Start NON-BLOCKING");
        Flux<String> stringFlux = WebClient.create()
                .post()
                .uri("http://localhost:8090/hello")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer {my-token}")
                .bodyValue("{}")
                .retrieve()
                .bodyToFlux(String.class);
        stringFlux.subscribe(str -> System.out.println(str));
        System.out.println("End   NON-BLOCKING");
    }

}
