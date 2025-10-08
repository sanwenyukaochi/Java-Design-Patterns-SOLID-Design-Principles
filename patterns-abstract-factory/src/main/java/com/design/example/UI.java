package com.design.example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UI {
    private final Button button;
    private final TextField textField;

    public void render() {
        button.render();
    }

    public void input() {
        textField.input();
    }
}