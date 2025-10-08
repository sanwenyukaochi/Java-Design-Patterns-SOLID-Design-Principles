package com.design.example.mac;

import com.design.example.Button;

// 具体产品：MacOS按钮
public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("渲染MacOS风格按钮");
    }
}