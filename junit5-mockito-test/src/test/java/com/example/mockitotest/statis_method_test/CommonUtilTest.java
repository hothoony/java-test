package com.example.mockitotest.statis_method_test;

import com.example.mockitotest.utils.CommonUtil;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static com.example.mockitotest.utils.CommonUtil.isBlank;
import static org.assertj.core.api.Assertions.assertThat;

class CommonUtilTest {

    @Test
    void isBlank_test() {
        
        assertThat(isBlank(null)).isTrue();
        assertThat(isBlank("")).isTrue();
        assertThat(isBlank(" ")).isTrue();
    }

    @Test
    void hasValue_test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method = CommonUtil.class.getDeclaredMethod("hasValue", String.class);
        System.out.println("method = " + method);
        System.out.println("method.trySetAccessible() = " + method.trySetAccessible());
        System.out.println("method.getModifiers() = " + method.getModifiers());
        method.setAccessible(true);
        System.out.println("method = " + method);
        System.out.println("method.getModifiers() = " + method.getModifiers());

        Boolean result = (boolean) method.invoke(CommonUtil.class, null);
        System.out.println("result = " + result);
    }

    @Test
    void hasValue_test2() throws NoSuchMethodException {

        Object resultValue = ReflectionTestUtils.invokeMethod(CommonUtil.class, "hasValue", null);
        System.out.println("resultValue = " + resultValue);
    }
}