import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class LoggingTest {

    protected static Logger log = LoggerFactory.getLogger(LoggingTest.class);

    @Test
    void test() {
        log.trace("Trace");
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");

        String str = null;
        assertThat(str).isNull();
    }
}
