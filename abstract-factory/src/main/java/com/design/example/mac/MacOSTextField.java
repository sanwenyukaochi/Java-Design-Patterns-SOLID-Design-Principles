package com.design.example.mac;

import com.design.example.TextField;

// 具体产品：MacOS文本框
public class MacOSTextField implements TextField {
    @Override
    public void input() {
        System.out.println("MacOS文本框输入");
    }
}