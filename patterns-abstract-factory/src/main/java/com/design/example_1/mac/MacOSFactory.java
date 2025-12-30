package com.design.example_1.mac;

import com.design.example_1.Button;
import com.design.example_1.GUIFactory;
import com.design.example_1.TextField;

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