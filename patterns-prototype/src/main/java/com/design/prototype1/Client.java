package com.design.prototype1;

public class Client {

	public static void main(String[] args) {
        Sheep dolly = new Sheep();
        dolly.setName("Dolly");
        Sheep clone = dolly.clone();
	}

}
