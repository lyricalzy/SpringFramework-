package com.mega.mvc05;

public class BananaComputer implements Computer {
	
	Mouse m;
	@Override
	public void start() {
		m = new MiniMouse();
		m.click();
		System.out.println("바나나컴퓨터 브라우저 시작");
	}

	@Override
	public void off() {
		System.out.println("바나나컴퓨터 종료");
	}

}
