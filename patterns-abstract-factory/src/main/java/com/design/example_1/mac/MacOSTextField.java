package com.design.example_1.mac;

import com.design.example_1.TextField;

// 具体产品：MacOS文本框
public class MacOSTextField implements TextField {
    @Override
    public void input() {
        IO.println("MacOS text input");
    }
}