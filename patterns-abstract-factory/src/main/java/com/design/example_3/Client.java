package com.design.example_3;

import com.design.example_3.audio.SendAudioFactory;
import com.design.example_3.mail.SendMailFactory;
import com.design.example_3.message.SendSmsFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {
    private final Provider provider;

    public MessageCenter getLogin() {
        Sender sender = provider.produce();
        return new MessageCenter(sender);
    }

    static void main() {
        Client mailClient = new Client(new SendMailFactory());
        MessageCenter mailMessageCenter = mailClient.getLogin();
        mailMessageCenter.send();

        Client smsClient = new Client(new SendSmsFactory());
        MessageCenter smsMessageCenter = smsClient.getLogin();
        smsMessageCenter.send();

        Client audioClient = new Client(new SendAudioFactory());
        MessageCenter audioMessageCenter = audioClient.getLogin();
        audioMessageCenter.send();
    }
}
