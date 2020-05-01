package com.mega.mvc05;

public class ChildBananaCar extends BananaCar{
	public ChildBananaCar(Window w) {
		super(w);
	}

	public void up() {
		System.out.println("속도를 높임");
	}
}
