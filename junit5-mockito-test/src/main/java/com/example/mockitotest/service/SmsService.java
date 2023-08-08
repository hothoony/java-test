package com.example.mockitotest.service;

import org.springframework.stereotype.Service;

@Service
public class SmsService {

    public String sendSms(String str) {
        return "sendSms OK";
    }
}
