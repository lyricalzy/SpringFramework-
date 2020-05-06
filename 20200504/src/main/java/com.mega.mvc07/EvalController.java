package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EvalController {

	@Autowired
	EvalDAO dao;

	@RequestMapping("all.do")
	public void all(EvalDTO dto, Model model) {
		List<EvalDTO> list2 = dao.all(dto);
		model.addAttribute("list2", list2);
	}

	@RequestMapping("add.do")
	public void add(EvalDTO dto, Model model) {
		dao.add(dto);
		model.addAttribute("dto2", dto);
	}

}
