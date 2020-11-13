package study.asserttest;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertTest {

    public static final String MESSAGE_ON_INVALID = "assert failed";

    @Test
    void test() {
        Assert.notNull(null, MESSAGE_ON_INVALID);
    }

    @Test
    void notEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            Assert.notEmpty(new ArrayList<>(), MESSAGE_ON_INVALID);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Assert.notEmpty(new String[]{}, MESSAGE_ON_INVALID);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Assert.notEmpty(new HashMap<>(), MESSAGE_ON_INVALID);
        });
    }

    @Test
    void isTrue() {
        assertThrows(IllegalArgumentException.class, () -> {
            Assert.isTrue(false, MESSAGE_ON_INVALID);
        });
        Assert.isTrue(true, MESSAGE_ON_INVALID);
    }

    @Test
    void isNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            Assert.isNull("", MESSAGE_ON_INVALID);
        });
        Assert.isNull(null, MESSAGE_ON_INVALID);
    }

    @Test
    void notNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            Assert.notNull(null, MESSAGE_ON_INVALID);
        });
        Assert.notNull("", MESSAGE_ON_INVALID);
    }

    @Test
    void doesNotContain() {
        assertThrows(IllegalArgumentException.class, () -> {
            Assert.doesNotContain("abcde", "bc", MESSAGE_ON_INVALID);
        });
        Assert.doesNotContain("abcde", "fg", MESSAGE_ON_INVALID);
    }

    @Test
    void hasText() {
        assertThrows(IllegalArgumentException.class, () -> {
            Assert.hasText(null, MESSAGE_ON_INVALID);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Assert.hasText("", MESSAGE_ON_INVALID);
        });
        Assert.hasText(".", MESSAGE_ON_INVALID);
    }
}
