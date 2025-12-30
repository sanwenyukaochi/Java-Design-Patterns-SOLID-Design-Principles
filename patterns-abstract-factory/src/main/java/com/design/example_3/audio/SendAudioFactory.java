package com.design.example_3.audio;

import com.design.example_3.Provider;
import com.design.example_3.Sender;

public class SendAudioFactory implements Provider {
    @Override
    public Sender produce() {
        return new AudioSender();
    }
}
