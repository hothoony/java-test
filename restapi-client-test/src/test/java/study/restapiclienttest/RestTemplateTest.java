package study.restapiclienttest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.restapiclienttest.restClient.restTemplate.UsingRestTemplate_HttpClient;
import study.restapiclienttest.restClient.restTemplate.UsingRestTemplate;
import study.restapiclienttest.restClient.restTemplate.UsingRestTemplate_simple;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RestTemplateTest {

    @Autowired private UsingRestTemplate usingRestTemplate;
    @Autowired private UsingRestTemplate_simple usingRestTemplate_simple;
    @Autowired private UsingRestTemplate_HttpClient usingRestTemplate_httpClient;

    @Test
    void notNull() {
        assertThat(usingRestTemplate).isNotNull();
        assertThat(usingRestTemplate_simple).isNotNull();
        assertThat(usingRestTemplate_httpClient).isNotNull();
    }
}
