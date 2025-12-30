package com.design.prototype;

public class Client {

    static void main() throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();
        IO.println(swordsman);

        Swordsman swordsman_clone = (Swordsman) swordsman.clone();
        IO.println(swordsman_clone);

        General general = new General();
        general.move(new Point3D(-10, 0, 0), 20);
        general.boostMorale();
        IO.println(general);

    }

}
