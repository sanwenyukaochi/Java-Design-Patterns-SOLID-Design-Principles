package com.design.example;

import com.design.example.mac.MacOSFactory;
import com.design.example.win.WindowsFactory;
import lombok.RequiredArgsConstructor;

// 客户端代码
@RequiredArgsConstructor
public class Client {
    private final GUIFactory factory;

    // 这里像 createServer 一样，组合多个产品
    public UI createUI() {
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        return new UI(button, textField);
    }

    static void main(String[] args) {
        Client winApp = new Client(new WindowsFactory());
        UI winUI = winApp.createUI();
        winUI.render();
        winUI.input();

        System.out.println("***************************************");

        Client macApp = new Client(new MacOSFactory());
        UI macUI = macApp.createUI();
        macUI.render();
        macUI.input();
    }
}