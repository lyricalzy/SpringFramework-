package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	
	@Autowired
	EvalDAO dao2;

	@RequestMapping("list.do")
	public void list(Model model) {
		List<MemberDTO> list = dao.list();
		model.addAttribute("list", list);
	}

	@RequestMapping("select.do")
	public void select(MemberDTO memberDTO, EvalDTO evalDTO, Model model) {
		MemberDTO dto = dao.select(memberDTO);
		evalDTO.setUserid(memberDTO.getId());;
		List<EvalDTO> list2 = dao2.all(evalDTO);
		model.addAttribute("list2", list2);
		model.addAttribute("dto", dto);
	}

	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO) {
		dao.insert(memberDTO);
	}

	@RequestMapping("delete.do")
	public void delete(MemberDTO memberDTO) {
		dao.delete(memberDTO);
	}

	@RequestMapping("update.do")
	public void update(MemberDTO memberDTO) {
		dao.update(memberDTO);
	}

}
