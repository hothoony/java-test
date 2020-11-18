package study.restapiclienttest;

import org.junit.jupiter.api.Test;

public class AssertExceptionTest {

    @Test
    void name() {
        MyCalc myCalc = (a, b) -> { return a + b; };
        int result = myCalc.add(1, 2);
        System.out.println("result = " + result);
    }

    @FunctionalInterface
    interface MyCalc {
        int add(int a, int b);
    }
}
