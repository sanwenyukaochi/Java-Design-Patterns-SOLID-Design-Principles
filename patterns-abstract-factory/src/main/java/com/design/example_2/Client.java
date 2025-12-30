package com.design.example_2;

import com.design.example_2.audio.SendAudioFactory;
import com.design.example_2.mail.SendMailFactory;
import com.design.example_2.message.SendSmsFactory;

public class Client {


    static void main() {
        Provider mailFactory = new SendMailFactory();
        Sender mailSender = mailFactory.produce();
        mailSender.send();

        Provider sendMailFactory = new SendSmsFactory();
        Sender smsSender = sendMailFactory.produce();
        smsSender.send();

        Provider sendAudioFactory = new SendAudioFactory();
        Sender audioSender = sendAudioFactory.produce();
        audioSender.send();

    }
}
