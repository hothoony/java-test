package study.functionalinterfacetest.v0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class MainLogic {
    
    public void execute() {
        log.info("로직 실행 시작");
        call();
        log.info("로직 실행 종료");
    }

    protected abstract void call();
    
}
