package com.design.example.win;
import com.design.example.Button;

// 具体产品：Windows按钮
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("渲染Windows风格按钮");
    }
}