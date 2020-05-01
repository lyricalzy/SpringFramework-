package com.mega.mvc05;

public class CarMain {

	public static void main(String[] args) {
		KCCWindow w = new KCCWindow();
		Car b = new ChildBananaCar(w);
		b.run();
		b.stop();
	}
}
