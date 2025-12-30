package com.design.example_1.win;
import com.design.example_1.Button;

// 具体产品：Windows按钮
public class WindowsButton implements Button {
    @Override
    public void render() {
        IO.println("Render Windows OS style buttons");
    }
}