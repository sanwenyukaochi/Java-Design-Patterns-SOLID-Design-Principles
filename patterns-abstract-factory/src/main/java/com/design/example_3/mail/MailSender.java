package com.design.example_3.mail;

import com.design.example_3.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        IO.println("Mail Sender");
    }
}
