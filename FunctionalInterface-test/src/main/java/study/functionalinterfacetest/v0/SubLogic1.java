package study.functionalinterfacetest.v0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubLogic1 extends AbstractLogic {
    
    @Override
    protected void call() {
        log.info("비지니스 로직1 실행");
    }
}
