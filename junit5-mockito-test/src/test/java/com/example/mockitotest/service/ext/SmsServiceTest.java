package com.example.mockitotest.service.ext;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.*;

@SpringBootTest(classes = {SmsService.class})
class SmsServiceTest {

    @Autowired
    SmsService smsService;

    @Test
    void sendMessage_private_call2() {

        ReflectionTestUtils.invokeMethod(smsService, "sendMessage", "999");
    }

    @Test
    void sendMessage_private_call1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method = SmsService.class.getDeclaredMethod("sendMessage", String.class);
        method.setAccessible(true);

        method.invoke(smsService, "999");
    }

    @Test
    void sendSms() throws NoSuchMethodException {

        smsService.sendSms("123");
    }

    @Test
    void notNull() {
        assertThat(smsService).isNotNull();
    }
}