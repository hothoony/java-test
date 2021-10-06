package study.stringutilstest.util;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class hasLength {

    @Test
    void hasLength() {
        assertThat(StringUtils.hasLength(null)).isFalse();
        assertThat(StringUtils.hasLength("")).isFalse();
        assertThat(StringUtils.hasLength(" ")).isTrue();
        assertThat(StringUtils.hasLength(".")).isTrue();
    }
}
