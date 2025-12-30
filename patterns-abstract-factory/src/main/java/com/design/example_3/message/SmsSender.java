package com.design.example_3.message;

import com.design.example_3.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        IO.println("SMS Sender");
    }
}
