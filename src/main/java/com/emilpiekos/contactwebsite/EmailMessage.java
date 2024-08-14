package com.emilpiekos.contactwebsite;

public class EmailMessage {
    private String subject;
    private String text;
    private String sender;

    public EmailMessage(String subject, String text, String sender) {
        this.subject = subject;
        this.text = text;
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
