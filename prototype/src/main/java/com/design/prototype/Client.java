package com.design.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();
        IO.println(swordsman);
        Swordsman swordsman_clone = (Swordsman) swordsman.clone();
        IO.println("Cloned swordsman" + swordsman_clone);

        General general = new General();
        general.move(new Point3D(-10, 0, 0), 20);
        IO.println(general);

    }

}
