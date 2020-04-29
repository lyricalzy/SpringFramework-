package com.mega.mvc04;

// 인터페이스는 객체생성(new) 불가
// 인터페이스 내의 메소드는 불완전하다(추상적, abstract)
// 인터페이스 내의 메소드는 추상메소드만 써야함
public interface Car { // 자동차가 되기위한 규격
	// 인터페이스에는 일반적인 변수를 넣지 않는다
	// 동작, 기능에 대한 정의만 한다
	// default는 public
	void run(); // 달리는 기능이 있어야 한다
	public abstract void speedUp(); // 속도를 올리는 기능이 있어야 한다
}
