package com.uhmarcel.mailer.controllers;

import com.uhmarcel.mailer.models.Email;
import com.uhmarcel.mailer.services.MailerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class MailerController {

    private MailerService mailerService;

    public MailerController(MailerService mailerService) {
        this.mailerService = mailerService;
    }

    @PostMapping("/send")
    public void sendEmail(@RequestBody Email email) {
        this.mailerService.sendMail(email);
    }

}
