package com.design.example_1;

import lombok.Setter;

@Setter
public class Swordsman extends GameUnit {

    private String state = "idle";

    @Override
    public String toString() {
        return String.format("Swordsman [state=%s, position=%s]", state, getPosition());
    }

    @Override
    protected void reset() {
        state = "idle";
    }

}
