package com.design.example_2.message;

import com.design.example_2.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        IO.println("SMS Sender");
    }
}
