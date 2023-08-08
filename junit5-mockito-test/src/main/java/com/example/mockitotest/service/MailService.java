package com.example.mockitotest.service;

import org.springframework.stereotype.Service;

@Service
public class MailService {

    public String sendMail(String str) {
        return "sendMail OK";
    }
}
