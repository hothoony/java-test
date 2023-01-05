## 추상 클래스를 사용하는 방법

1. 추상 클래스로 템플릿 로직을 정의한다
```java
public abstract class MainLogic {
    
    // 템플릿 로직
    public void execute() {
        log.info("로직 실행 시작");
        call();
        log.info("로직 실행 종료");
    }

    // 서브 클래스에서 구현할 메소드
    protected abstract void call();
    
}
```
2. 추상 클래스를 상속한 서브 클래스를 만들고 추가할 로직을 구현한다
```java
public class SubLogic1 extends MainLogic {
    
    @Override
    protected void call() {
        log.info("비지니스 로직1 실행");
    }
}
```
3. 서브 클래스 인스턴스를 만들고 메소드를 호출한다
```java
public class V0_test {

    @Test
    void subLogic1() {
        MainLogic subLogic1 = new SubLogic1();
        subLogic1.execute();
    }
}
```
4. 실행결과
```
11:25:14.456 [main] INFO study.functionalinterfacetest.v0.MainLogic - 로직 실행 시작
11:25:14.459 [main] INFO study.functionalinterfacetest.v0.SubLogic1 - 비지니스 로직1 실행
11:25:14.459 [main] INFO study.functionalinterfacetest.v0.MainLogic - 로직 실행 종료
```

## FunctionInternalInterface 를 사용하는 방법

1. 일반 클래스로 템플릿 로직을 정의한다
```java
public class MainLogic {
    
    public void execute(SubLogic subLogic) {
        log.info("로직 실행 시작");
        subLogic.call();
        log.info("로직 실행 종료");
    }

}
```
2. `@FunctionalInterface` 로 서브 로직에서 구현할 메소드를 정의한다
```java
@FunctionalInterface
public interface SubLogic {
    
    void call();
}
```
3. 메소드 호출시 람다 표현식을 파라미터로 넘긴다
```java
public class V1_test {

    @Test
    void subLogic1() {
        MainLogic subLogic = new MainLogic();
        subLogic.execute(() -> {
            log.info("비지니스 로직1 실행");
        });
    }
}
```
4. 실행경과
```
11:30:50.349 [main] INFO study.functionalinterfacetest.v1.MainLogic - 로직 실행 시작
11:30:50.351 [main] INFO study.functionalinterfacetest.v1.V1_test - 비지니스 로직1 실행
11:30:50.351 [main] INFO study.functionalinterfacetest.v1.MainLogic - 로직 실행 종료
```
