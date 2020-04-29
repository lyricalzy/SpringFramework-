package com.mega.mvc04;

public class ApplePhone implements Phone {

	@Override
	public void call() {
		System.out.println("전화를 걸다");
	}

	@Override
	public void answer() {
		System.out.println("전화를 받다");
	}

}
