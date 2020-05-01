package com.mega.mvc05;

public class BananaCar implements Car {
	Window w;
	
	public BananaCar(Window w) {
		//super();
		this.w = w;
	}

	@Override
	public void run() {
		System.out.println("BananaCar 출발");
		//w = new LGWindow();
		w.open(); // 주소값
		// Car는 Window에 의존적이다.
	}

	@Override
	public void stop() {
		System.out.println("BananaCar 정지");
		w.close();
	}

}
