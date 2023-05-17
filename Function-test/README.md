
```
Supplier       ()    -> x              // 파라미터는 없고, 값을 리턴한다
Consumer       x     -> ()             // 파라미터가 있고, 값을 리턴하지 않는다
BiConsumer     x, y  -> ()             // 파라미터가 여러 개 있고, 값을 리턴하지 않는다
Callable       ()    -> x throws ex    // 
Runnable       ()    -> ()             // 파라미터도 없고, 값도 리턴하지 않는다
Function       x     -> y              // 파라미터가 있고, 값을 리턴한다
BiFunction     x,y   -> z              // 
Predicate      x     -> boolean        // 
UnaryOperator  x1    -> x2             // 
BinaryOperator x1,x2 -> x3             // 
```


## apply
- `Function` 으로 정의한 함수를 실행한다
```java
@Slf4j
public class Function_apply_Test {

    @Test
    void name() {
        
        Function<Integer, Integer> fn = x -> x * 2;
        
        Integer result = fn.apply(3);
        
        log.info("result = {}", result); // result = 6
    }
}
```

## andThen
- `Function` 으로 정의한 함수를 순차적으로 실행한다
```java
@Slf4j
public class Function_andThen_Test {

    @Test
    void name() {
        
        Function<Integer, Integer> fn1 = x -> x * 2;
        Function<Integer, String> fn2 = x -> "result = " + x;

        String result = fn1.andThen(fn2).apply(3);

        log.info("RESULT => {}", result); // RESULT => result = 6
    }
}
```

## compose
- `Function` 여러 개를 합쳐서 하나의 `Function` 으로 만든다
```java
@Slf4j
public class Function_compose_Test {

    @Test
    void name() {

        Function<Integer, Double> add = n -> n + 2.0;
        Function<Double, Double> multiply = n -> n * 5.0;
        Function<Integer, Double> addAndMultiply = multiply.compose(add); // compose 로 Function 을 합쳐서 하나로 만든다

        Double result = addAndMultiply.apply(3);
        
        log.info("result = {}", result); // result = 25.0
    }
}
```
