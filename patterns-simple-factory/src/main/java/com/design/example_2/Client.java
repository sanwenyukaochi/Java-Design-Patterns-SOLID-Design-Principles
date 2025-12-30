package com.design.example_2;

public class Client {

    static void main() {
        Sender mail = SendFactory.product("mail");
        Sender sms = SendFactory.product("sms");
    }

}
