package com.design.example.mac;

import com.design.example.Button;
import com.design.example.GUIFactory;
import com.design.example.TextField;

// 具体工厂：MacOS组件工厂
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextField createTextField() {
        return new MacOSTextField();
    }
}