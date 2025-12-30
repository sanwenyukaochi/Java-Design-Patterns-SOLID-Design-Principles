package com.design.example_3.mail;

import com.design.example_3.Provider;
import com.design.example_3.Sender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
