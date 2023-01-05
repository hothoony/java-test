# 람다 표현식을 파라미터로 넘기기

## 코드 정의

- `@FunctionalInterface` 를 정의한다
```java
@FunctionalInterface
public interface Foo {
    
    String someMethod(String str);
}
```

- `@FunctionalInterface` 를 파라미터로 받는 클래스
```java
public class FunctionalInterfaceParamService {
    
    public String add(String str, Foo foo) {
        return foo.someMethod(str);
    }
}
```

- `Function<String, String>` 을 파라미터로 받는 클래스
```java
public class FunctionParamService {
    
    public String add(String str, Function<String, String> fn) {
        return fn.apply(str);
    }
}
```

## 테스트

- `@FunctionalInterface` 를 파라미터로 받는 클래스에 람다 표현식을 파라미터로 던진다
```java
class FunctionalInterfaceParamTest {
    
    FunctionalInterfaceParamService service = new FunctionalInterfaceParamService();

    @Test
    void test() {
        // 람다 표현식을 파라미터로 던진다
        String result = service.add("hello", param -> param + " world");
        log.info("result = {}", result);
    }
}
```
- `Function<String, String>` 를 파라미터로 받는 클래스에 람다 표현식을 파라미터로 던진다
```java
class FunctionParamServiceTest {

    FunctionParamService service = new FunctionParamService();
        
    @Test
    void test() {
        // 람다 표현식을 파라미터로 던진다
        String result = service.add("hello", param -> param + " world");
        log.info("result = {}", result);
    }
}
```
