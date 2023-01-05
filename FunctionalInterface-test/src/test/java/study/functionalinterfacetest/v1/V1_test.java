package study.functionalinterfacetest.v1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class V1_test {

    /**
     * FunctionalInterface SubLogic 를 선언하고
     * lambda 를 사용해서 호출
     */

    @Test
    void subLogic1() {
        MainLogic subLogic = new MainLogic();
        subLogic.execute(() -> {
            log.info("비지니스 로직1 실행");
        });
    }

    @Test
    void subLogic2() {
        MainLogic subLogic = new MainLogic();
        subLogic.execute(() -> {
            log.info("비지니스 로직2 실행");
        });
    }
}
