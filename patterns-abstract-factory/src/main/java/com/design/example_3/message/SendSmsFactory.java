package com.design.example_3.message;

import com.design.example_3.Provider;
import com.design.example_3.Sender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
