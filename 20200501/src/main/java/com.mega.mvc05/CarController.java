package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // controller 등록, controller 상속
public class CarController {

	@Autowired 
	@Qualifier("c1") // 주입할 객체가 두개 이상일때(c1은  bean의 이름)
	Car car;
	// 의존성을 맺어주는 것은 주소만 있으면 된다.
	// 외부 파일에서 만든 주소를 car변수에 spring이 찾아서 넣어줌
	// Car상속이나, 구현된 객체의 생성된 주소를 찾아서 주입

	@RequestMapping("car.do")
	public void run() {
		car.run();
	}

}
