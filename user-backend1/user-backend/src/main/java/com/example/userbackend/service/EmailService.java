package com.example.userbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    public JavaMailSender emailSender;

    private void send(String email, String subject , String content){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("abc@gmail.com");
        message.setSubject("Test Simple Email");
        message.setText("Hello World");

        // Send Message!
        emailSender.send(message);
    }

}
