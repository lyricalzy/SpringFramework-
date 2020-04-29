package com.mega.mvc04;

public class AppleCar implements Car {

	@Override
	public void run() {
		System.out.println("빨리 달리다.");
	}

	@Override
	public void speedUp() {
		System.out.println("한번에 100km/h로 올리다");
	}

}
