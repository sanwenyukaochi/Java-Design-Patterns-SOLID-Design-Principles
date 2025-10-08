package com.design.prototype;

import lombok.ToString;


public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return String.format("Swordsman [state=%s, position=%s]", state, getPosition());
    }

    @Override
    protected void reset() {
        state = "idle";
    }


}
