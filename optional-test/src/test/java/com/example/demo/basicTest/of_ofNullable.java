package com.example.demo.basicTest;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class of_ofNullable {

    /**
     * of, ofNullable : Optional 을 정의
     * - Optional.of(값) : 값이 null 일 수 없다. null 인 경우 exception 을 발생시킨다
     * - Optional.ofNullable(값) : 값이 null 일 수 있다
     */

    @Test
    void of() {
        assertThatThrownBy(() -> {
            Optional.of(null);
        }).isInstanceOf(NullPointerException.class);
    }

    @Test
    void ofNullable() {
        Optional<Object> optional = Optional.ofNullable(null);
        assertThat(optional).isEqualTo(Optional.empty());
    }
}
