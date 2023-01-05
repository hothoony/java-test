package study.functionalinterfacetest.v0;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class V0_test2 {

    /**
     * 서브 클래스를 만들지 않고 익명 클래스를 사용
     */

    @Test
    void subLogic1() {
        MainLogic subLogic = new MainLogic() {

            @Override
            protected void call() {
                log.info("비지니스 로직1 실행");
            }
        };
        subLogic.execute();
    }

    @Test
    void subLogic2() {
        MainLogic subLogic = new MainLogic() {

            @Override
            protected void call() {
                log.info("비지니스 로직2 실행");
            }
        };
        subLogic.execute();
    }
}
