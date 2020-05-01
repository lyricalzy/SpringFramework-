package com.mega.mvc05;

public class AppleComputer implements Computer {

	Mouse m;

	@Override
	public void start() {
		m = new MikeyMouse();
		m.click();
		System.out.println("애플컴퓨터 브라우저 시작");
	}

	@Override
	public void off() {
		System.out.println("애플컴퓨터 종료");
	}

}
