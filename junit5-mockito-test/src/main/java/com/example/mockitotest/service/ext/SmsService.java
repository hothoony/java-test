package com.example.mockitotest.service.ext;

import org.springframework.stereotype.Service;

@Service
public class SmsService {

    public void sendSms(String str) {
        System.out.println("sendSms begin");
        sendMessage(str);
        System.out.println("sendSms end");
    }

    private void sendMessage(String str) {
        System.out.println("sendSms message - " + str);
    }
}
