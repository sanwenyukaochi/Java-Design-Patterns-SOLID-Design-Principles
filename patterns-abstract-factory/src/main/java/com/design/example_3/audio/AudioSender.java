package com.design.example_3.audio;

import com.design.example_3.Sender;

public class AudioSender implements Sender {
    @Override
    public void send() {
        IO.println("Audio Sender");
    }
}
