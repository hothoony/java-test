package study.restapiclienttest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.restapiclienttest.restClient.webClient.UsingWebClient;
import study.restapiclienttest.restClient.webClient.UsingWebClient_timeout;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class WebClientTest {

    @Autowired private UsingWebClient usingWebClient;
    @Autowired private UsingWebClient_timeout usingWebClient_timeout;

    @Test
    void notNull() {
        assertThat(usingWebClient).isNotNull();
        assertThat(usingWebClient_timeout).isNotNull();
    }
}
