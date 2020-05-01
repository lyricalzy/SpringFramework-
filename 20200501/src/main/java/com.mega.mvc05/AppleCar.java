package com.mega.mvc05;

public class AppleCar implements Car {
	Window w;

	public AppleCar(Window w) {
		//super();
		this.w = w;
	}

	@Override
	public void run() {
		System.out.println("AppleCar 출발");
		//w = new LGWindow();
		w.open();
	}

	@Override
	public void stop() {
		System.out.println("AppleCar 정지");
		w.close();
	}

}
