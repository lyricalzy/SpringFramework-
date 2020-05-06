package com.mega.mvc08;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	@RequestMapping("list.do")
	public void list(Model model) {
		List<BbsDTO> list = dao.list();
		model.addAttribute("list", list);
	}

	@RequestMapping("select.do")
	public void select(BbsDTO bbsDTO, ReplyDTO replyDTO, Model model, HttpSession session) {
		session.setAttribute("writer", "park");
		BbsDTO dto = dao.select(bbsDTO);
		replyDTO.setOgid(bbsDTO.getId());
		List<ReplyDTO> list2 = dao2.all(replyDTO);
		model.addAttribute("list2", list2);
		model.addAttribute("dto", dto);
	}

	@RequestMapping("insert.do")
	public void insert(BbsDTO bbsDTO) {
		dao.insert(bbsDTO);
	}
	
	@RequestMapping("delete.do")
	public void delete(BbsDTO bbsDTO) {
		dao.delete(bbsDTO);
	}
	
	@RequestMapping("update.do")
	public void update(BbsDTO bbsDTO) {
		dao.update(bbsDTO);
	}
}
