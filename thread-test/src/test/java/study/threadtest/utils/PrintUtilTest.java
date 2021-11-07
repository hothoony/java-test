package study.threadtest.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static study.threadtest.utils.PrintUtil.print;

class PrintUtilTest {

    @Test
    void printTest() {
        assertThat(print("print")).isEqualTo("print");
        assertThat(print("print {}", 1)).isEqualTo("print 1");
        assertThat(print("print {} {}", 1, 2)).isEqualTo("print 1 2");
        assertThat(print("print {} {} {}", 1, 2, 3)).isEqualTo("print 1 2 3");
        assertThat(print("print {} {}", 1)).isEqualTo("print 1 {}");
        assertThat(print("print {}", 1, 2)).isEqualTo("print 1");
    }

}
