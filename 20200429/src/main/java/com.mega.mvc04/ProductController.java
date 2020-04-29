package com.mega.mvc04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO dao;

	@RequestMapping("insert2.do")
	public String insert(ProductDTO productDTO) {
		dao.insert(productDTO);
		System.out.println("제품 등록 실행");
		return "result";
	}
}
