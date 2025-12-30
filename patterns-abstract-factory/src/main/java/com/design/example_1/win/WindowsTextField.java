package com.design.example_1.win;

import com.design.example_1.TextField;

// 具体产品：Windows文本框
public class WindowsTextField implements TextField {
    @Override
    public void input() {
        IO.println("Windows OS text box input");
    }
}