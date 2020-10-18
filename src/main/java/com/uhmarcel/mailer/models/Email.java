package com.uhmarcel.mailer.models;

import java.util.LinkedHashMap;

public class Email {

    private String destination;
    private String subject;
    private LinkedHashMap<String, String> body;

    public Email(String destination, String subject, LinkedHashMap<String, String> body) {
        this.destination = destination;
        this.subject = subject;
        this.body = body;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LinkedHashMap<String, String> getBody() {
        return body;
    }

    public void setBody(LinkedHashMap<String, String> body) {
        this.body = body;
    }

    public String buildBody() {
        StringBuilder sb = new StringBuilder();
        for (String key : this.body.keySet()) {
            sb.append(String.format("%s:\n", key));
            sb.append(String.format("%s\n\n", this.body.get(key)));
        }
        return sb.toString();
    }
}
