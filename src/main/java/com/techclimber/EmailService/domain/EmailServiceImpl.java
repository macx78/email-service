package com.techclimber.EmailService.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService{

    @Autowired
    public JavaMailSender emailSender;


    public void sendSimpleMessage(String toIn, String subjectIn, String textIn){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(toIn);
        msg.setSubject(subjectIn);
        msg.setText(textIn);
        emailSender.send(msg);

    }

    @Override
    public void sendSimpleMessageUsingTemplate(String to, String subject, SimpleMailMessage template, String... templateArgs) {

    }

    @Override
    public void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment) {

    }
}
