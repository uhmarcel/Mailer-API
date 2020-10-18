package com.uhmarcel.mailer.services;

import com.uhmarcel.mailer.models.Email;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailerService {

    private JavaMailSender javaMailSender;

    public MailerService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email.getDestination());
        message.setSubject(email.getSubject());
        message.setText(email.buildBody());
        javaMailSender.send(message);
    }

}
