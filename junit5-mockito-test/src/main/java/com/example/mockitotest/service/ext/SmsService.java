package com.example.mockitotest.service.ext;

import org.springframework.stereotype.Service;

@Service
public class SmsService {

    public void sendSms(String str) {
        System.out.println("sendSms begin");
        sendMessage(str);
        System.out.println("sendSms end");
    }

    private String sendMessage(String str) {
        sendMessageStep1();
        System.out.println("sendSms message - " + str);
        sendMessageStep2();
        return str;
    }

    private void sendMessageStep1() {

    }

    private void sendMessageStep2() {

    }
}
