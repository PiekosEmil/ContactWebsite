package com.emilpiekos.contactwebsite;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    JavaMailSender mailSender;

    public MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String subject, String reply, String text) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("testerjava1996@op.pl");
        message.setTo("nigowoy464@givehit.com");
        message.setSubject(subject);
        message.setReplyTo(reply);
        message.setText(text);

        mailSender.send(message);
    }
}
