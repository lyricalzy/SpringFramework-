package com.mega.mvc05;

public class LGWindow implements Window {

	@Override
	public void open() {
		System.out.println("LG창문을 열다");
	}

	@Override
	public void close() {
		System.out.println("LG창문을 닫다");
	}
}
