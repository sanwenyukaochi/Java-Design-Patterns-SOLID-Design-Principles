package com.design.example_2.audio;

import com.design.example_2.Provider;
import com.design.example_2.Sender;

public class SendAudioFactory implements Provider {
    @Override
    public Sender produce() {
        return new AudioSender();
    }
}
