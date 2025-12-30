package com.design.example_2.message;

import com.design.example_2.Provider;
import com.design.example_2.Sender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
