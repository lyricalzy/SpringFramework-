package com.mini.minishop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {

	@Autowired
	ShopDAO dao;

	@RequestMapping("list.do")
	public void list(Model model, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "1") int range) {
		int listCnt = dao.countRow();

		Pagination pagination = new Pagination();

		pagination.pageInfo(page, range, listCnt);

		model.addAttribute("page", pagination);

		model.addAttribute("list", dao.list(pagination));
	}

	@RequestMapping("select.do")
	public void select(ShopDTO shopDTO, Model model) {
		ShopDTO dto = dao.select(shopDTO);
		model.addAttribute("dto", dto);
	}

	@RequestMapping("delete.do")
	public void delete(ShopDTO shopDTO, Model model) {
		dao.delete(shopDTO);
		model.addAttribute("dto", shopDTO);
	}

	@RequestMapping("update.do")
	public void update(ShopDTO shopDTO, Model model) {
		dao.update(shopDTO);
		model.addAttribute("dto", shopDTO);
	}
}
