package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class test_anyMatch {

    @Test
    void name() {

        List<String> requestUris = Arrays.asList(
                "/api/br/v1/notice",
                "/api/bo/v1/notice",
                "/api/if/v1/notice",
                "/api/auth/email"
        );

        for (String requestUri : requestUris) {
            boolean found = checkUri(requestUri);
            System.out.println(requestUri + " = " + found);
        }
    }

    /**
     * requestUri 가 excludeUris 에 해당되는지 확인
     */
    private static boolean checkUri(String requestUri) {
        List<String> excludeUris = Arrays.asList("/api/bo/", "/api/if/");
        return excludeUris.stream().anyMatch(o -> requestUri.startsWith(o));
    }
}
