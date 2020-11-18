package study.restapiclienttest.restClient.restTemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class UsingRestTemplate extends UsingRestTemplate_BASE {

    private final RestTemplate restTemplate;

    public void callApi() {
        System.out.println();
        System.out.println("callApi UsingRestTemplate");
        System.out.println("restTemplate");
        super.callApi(restTemplate);
    }

}
