package com.example.mockitotest.service;

import org.springframework.stereotype.Service;

@Service
public class MailService {

    public void sendMail(String str) {
        System.out.println("sendMail begin");
        sendMessage(str);
        System.out.println("sendMail end");
    }

    public void sendMessage(String str) {
        System.out.println("sendMessage - " + str);
    }
}
