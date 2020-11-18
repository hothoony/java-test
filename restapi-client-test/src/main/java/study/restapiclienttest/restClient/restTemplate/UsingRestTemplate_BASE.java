package study.restapiclienttest.restClient.restTemplate;

import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import study.restapiclienttest.restServer.RestConfig;

import java.net.ConnectException;

import static study.restapiclienttest.util.ExceptionUtil.getRootCause;

public class UsingRestTemplate_BASE {

    protected void callApi(RestTemplate restTemplate) {
        ResponseEntity<String> response = null;

        try {
            String url = RestConfig.SERVER_URL + "/hello";

            String requestBody = "{}";

            HttpHeaders requestHeaders = new HttpHeaders();
            requestHeaders.setContentType(MediaType.APPLICATION_JSON);
            requestHeaders.setBearerAuth("{my-token}");

            HttpEntity<String> httpEntity = new HttpEntity<>(requestBody, requestHeaders);

            response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
            System.out.println("code = " + response.getStatusCode());
            HttpHeaders headers = response.getHeaders();
            MediaType contentType = headers.getContentType();
            String body = response.getBody();
            System.out.println("contentType = " + contentType);
            System.out.println("body = " + body);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
            if (getRootCause(e) instanceof ConnectException) {
                System.out.println("connection failed");
            } else if (getRootCause(e) instanceof HttpClientErrorException) {
                System.out.println("http client error");
                HttpClientErrorException e2 = (HttpClientErrorException) e;
                System.out.println("e2.getStatusCode() = " + e2.getStatusCode());
                System.out.println("e2.getResponseBodyAsString() = " + e2.getResponseBodyAsString());
            }
        }
    }

}
