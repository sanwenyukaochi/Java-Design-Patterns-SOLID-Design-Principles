package com.design.example_2.mail;

import com.design.example_2.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        IO.println("Mail Sender");
    }
}
