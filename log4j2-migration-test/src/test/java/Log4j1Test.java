import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class Log4j1Test {

    private static Logger logger = Logger.getLogger(Log4j1Test.class);

    @Test
    void debugTest() {
        try {
            logger.debug("11");
            throw new IllegalStateException("에러발생");
        } catch (Exception e) {
            logger.debug("22", e);
        }
    }

    @Test
    void infoTest() {
        try {
            logger.info("11");
            throw new IllegalStateException("에러발생");
        } catch (Exception e) {
            logger.info("22", e);
        }
    }

    @Test
    void errorTest() {
        try {
            logger.error("11");
            throw new IllegalStateException("에러발생");
        } catch (Exception e) {
            logger.error("22", e);
        }
    }

}
