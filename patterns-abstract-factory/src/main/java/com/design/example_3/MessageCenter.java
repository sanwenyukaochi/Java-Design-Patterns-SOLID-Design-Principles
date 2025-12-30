package com.design.example_3;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MessageCenter {
    private final Sender sender;

    public void send() {
        sender.send();
    }
}
