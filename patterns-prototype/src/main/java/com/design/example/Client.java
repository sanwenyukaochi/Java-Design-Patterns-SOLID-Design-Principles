package com.design.example;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.setState("attacking");
        IO.println(swordsman);
        Swordsman swordsmanClone = (Swordsman) swordsman.clone();
        IO.println(swordsmanClone);
    }

}
