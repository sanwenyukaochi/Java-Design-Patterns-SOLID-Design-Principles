package com.design.example_2;

public class SendFactory {
    private SendFactory() {}
    public static Sender product(String type) {
        return switch (type) {
            case "mail" -> new MailSender();
            case "sms" -> new SmsSender();
            default -> throw new IllegalArgumentException("Sender type does not exist");
        };
    }
}
