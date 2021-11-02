package study.functionalinterfacetest.v0;

import org.junit.jupiter.api.Test;

public class V0_test {

    /**
     * 서브 클래스를 만들어야 함
     */

    @Test
    void subLogic1() {
        AbstractLogic subLogic1 = new SubLogic1();
        subLogic1.execute();
    }

    @Test
    void subLogic2() {
        AbstractLogic subLogic2 = new SubLogic2();
        subLogic2.execute();
    }
}
