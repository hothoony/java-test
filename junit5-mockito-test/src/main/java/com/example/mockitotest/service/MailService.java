package com.example.mockitotest.service;

import org.springframework.stereotype.Service;

@Service
public class MailService {

    public void sendMail(String str) {
        System.out.println("sendMail OK - " + str);
    }
}
