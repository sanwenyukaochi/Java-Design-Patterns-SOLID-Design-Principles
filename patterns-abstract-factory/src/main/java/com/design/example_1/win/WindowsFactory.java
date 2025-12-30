package com.design.example_1.win;

import com.design.example_1.Button;
import com.design.example_1.GUIFactory;
import com.design.example_1.TextField;

// 具体工厂：Windows组件工厂
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}