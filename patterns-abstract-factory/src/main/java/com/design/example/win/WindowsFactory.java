package com.design.example.win;

import com.design.example.Button;
import com.design.example.GUIFactory;
import com.design.example.TextField;

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