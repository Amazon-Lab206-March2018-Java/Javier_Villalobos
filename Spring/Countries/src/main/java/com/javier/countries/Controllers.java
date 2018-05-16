package com.javier.countries;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {
	
	private final ApiService service;
	public Controllers(ApiService service) {
		this.service=service;
	}
	@RequestMapping("/")
	public void index() {
		
		System.out.println("----------------------------");
		service.test();
	}
}
