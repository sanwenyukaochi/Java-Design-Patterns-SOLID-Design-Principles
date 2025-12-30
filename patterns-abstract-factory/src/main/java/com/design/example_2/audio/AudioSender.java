package com.design.example_2.audio;

import com.design.example_2.Sender;

public class AudioSender implements Sender {
    @Override
    public void send() {
        IO.println("Audio Sender");
    }
}
