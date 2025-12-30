package com.design.example_1.win;
import com.design.example_1.Button;

// 具体产品：Windows按钮
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("渲染Windows风格按钮");
    }
}