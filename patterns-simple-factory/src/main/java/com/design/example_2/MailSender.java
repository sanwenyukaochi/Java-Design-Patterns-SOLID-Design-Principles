package com.design.example_2;

public class MailSender implements Sender {
    @Override
    public void send() {
        IO.println("Mail Sender");
    }
}
