package com.design.prototype1;

public class Client {

	static void main() throws CloneNotSupportedException {
        Sheep dolly = new Sheep();
        dolly.setName("Dolly");
        IO.println(dolly);
        Sheep dolly_clone = dolly.clone();
        IO.println(dolly_clone);
	}

}
