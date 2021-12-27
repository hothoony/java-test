import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class Log4j2Test {

    private static Logger logger = LogManager.getLogger(Log4j2Test.class);

    @Test
    void test() {
        try {
            callInner();
        } catch (Exception e) {
            logger.error("66 Error " + e.getMessage(), e);
        }
    }

    void callInner() {
        try {
            logger.trace("11 Trace");
            logger.debug("22 Debug");
            logger.info("33 Info");
            logger.warn("44 Warn");
            throw new IllegalStateException("에러발생");
        } catch (Exception e) {
//            logger.error("55 Error " + e.getMessage());
            logger.error("55 Error " + e.getMessage(), e);
            throw e;
        }
    }

}
