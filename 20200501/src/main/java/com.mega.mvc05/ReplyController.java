package com.mega.mvc05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {

	@RequestMapping("text.mega")
	public void text(String text, Model model) {
		model.addAttribute("text", text);
	}
	
	@RequestMapping("img.mega")
	public void img() {
		
	}
}
