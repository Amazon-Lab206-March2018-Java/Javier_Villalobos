package com.javier.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Controllers {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/code",method=RequestMethod.POST)
	public String process(@RequestParam(value="word") String code, RedirectAttributes redirectAtributes) {
		if(code.equals("bushido")) {
			return "code.jsp";
		}
		else {
			redirectAtributes.addFlashAttribute("errors", "You must train harder");
			return "redirect:/";
		}
	}
}
