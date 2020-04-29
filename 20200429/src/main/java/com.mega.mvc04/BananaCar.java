package com.mega.mvc04;

public class BananaCar implements Car {

	@Override
	public void run() {
		System.out.println("출발");
	}

	@Override
	public void speedUp() {
		System.out.println("가속");
	}

}
