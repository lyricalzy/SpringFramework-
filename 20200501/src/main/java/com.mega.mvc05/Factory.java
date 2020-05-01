package com.mega.mvc05;

// 객체 생성만 담당
public class Factory {
	public Object getBean(String name) {

		if (name.equals("kcc")) {
			return new KCCWindow();
		} else if (name.equals("lg")) {
			return new LGWindow();
		} else {
			return null;
		}
	}
}
