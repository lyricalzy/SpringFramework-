package com.mega.mvc05;

import javax.swing.JOptionPane;

public class CarMain2 {
	public static Window w;

	public static void main(String[] args) {
		Factory factory = new Factory();

		String name = JOptionPane.showInputDialog("kcc, lg중 선택");
		w = (Window) factory.getBean(name);

		Car b = new ChildBananaCar(w);
		b.run();
		b.stop();
	}
}
