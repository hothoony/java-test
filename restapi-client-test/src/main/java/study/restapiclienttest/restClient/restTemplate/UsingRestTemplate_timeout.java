package study.restapiclienttest.restClient.restTemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class UsingRestTemplate_timeout extends UsingRestTemplate_BASE {

    private final RestTemplate restTemplate_timeout;

    public void callApi() {
        System.out.println();
        System.out.println("callApi UsingRestTemplate");
        System.out.println("restTemplate_timeout");
        super.callApi(restTemplate_timeout);
    }

}
