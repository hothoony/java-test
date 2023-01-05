package study.functionalinterfacetest.v1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainLogic {
    
    public void execute(SubLogic subLogic) {
        log.info("로직 실행 시작");
        subLogic.call();
        log.info("로직 실행 종료");
    }

}
