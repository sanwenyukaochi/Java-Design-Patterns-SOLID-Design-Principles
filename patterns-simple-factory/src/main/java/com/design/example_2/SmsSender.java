package com.design.example_2;

public class SmsSender implements Sender {
    @Override
    public void send() {
        IO.println("SMS Sender");
    }
}
