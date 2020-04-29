package com.mega.mvc04;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Annotation(어노테이션, 표기)
public class MemberController {
	
	@Autowired
	MemberDAO dao; // 싱글톤으로 만든 객체의 주소를 넣어줌

	@RequestMapping("select.do")
	public void find(String find, Model model) {
		System.out.println("검색할 항목은 " + find);
		ArrayList<String> list = dao.select(find);
		String result = "";
		for (String s : list) {
			result = result + s + " ";
		}
		model.addAttribute("list", result);
		model.addAttribute("find", find);
	}

	@RequestMapping("check.do")
	public String login(MemberDTO memberDTO) {
		System.out.println("컨트롤러 login() 호출 성공");
		int result = dao.login(memberDTO);
		String page = "";
		if (result == 1) {
			page = "ok";
		} else {
			page = "redirect:login.jsp";
		}
		return page;
	}

	// 컨트롤 처리단위는 메소드로 만든다.
	@RequestMapping("insert.do")
	public String insert(MemberDTO memberDTO) {
		System.out.println("컨트롤러 insert() 호출 성공");
		dao.insert(memberDTO);
		return "list";
	}
}
