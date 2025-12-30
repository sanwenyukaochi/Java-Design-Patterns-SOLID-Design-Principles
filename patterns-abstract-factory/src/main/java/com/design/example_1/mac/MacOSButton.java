package com.design.example_1.mac;

import com.design.example_1.Button;

// 具体产品：MacOS按钮
public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("渲染MacOS风格按钮");
    }
}