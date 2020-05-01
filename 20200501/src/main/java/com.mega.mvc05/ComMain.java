package com.mega.mvc05;

public class ComMain {

	public static void main(String[] args) {
		AppleComputer ac = new AppleComputer();
		ac.start();
		ac.off();
		BananaComputer bc = new BananaComputer();
		bc.start();
		bc.off();
	}

}
