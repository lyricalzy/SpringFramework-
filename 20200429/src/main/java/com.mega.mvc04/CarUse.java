package com.mega.mvc04;

public class CarUse {

	public static void main(String[] args) {
		System.out.println("코드 변경함...");
		AppleCar ac = new AppleCar();
		ac.run();
		ac.speedUp();
		BananaCar bc = new BananaCar();
		bc.run();
		bc.speedUp();
	}
}
