package com.design.example_2.mail;

import com.design.example_2.Provider;
import com.design.example_2.Sender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
