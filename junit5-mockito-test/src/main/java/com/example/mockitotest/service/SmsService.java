package com.example.mockitotest.service;

import org.springframework.stereotype.Service;

@Service
public class SmsService {

    public void sendSms(String str) {
        System.out.println("sendSms OK - " + str);
    }
}
