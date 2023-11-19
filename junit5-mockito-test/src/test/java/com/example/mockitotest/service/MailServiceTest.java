package com.example.mockitotest.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class MailServiceTest {

    @Spy
    MailService mailService;

    @Test
    void test1() {

        willAnswer(invocation -> {
            System.out.println("SEND MAIL MESSAGE");
            return null;
        }).given(mailService).sendMessage(anyString());

        mailService.sendMail("123");
    }

    @Test
    void test2() {

        mailService.sendMail("123");
    }
}