package study.optionaltest;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class isPresent_isEmpty {

    private String str = "";

    @Test
    void isEmpty() {
        Optional<String> optional = Optional.ofNullable(null);

        assertThat(optional.isEmpty()).isTrue();
        assertThat(optional.isPresent()).isFalse();
    }

    @Test
    void isPresent() {
        Optional<String> optional = Optional.ofNullable("");

        assertThat(optional.isEmpty()).isFalse();
        assertThat(optional.isPresent()).isTrue();
    }
}
