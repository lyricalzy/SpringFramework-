package com.mega.mvc08;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;

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
