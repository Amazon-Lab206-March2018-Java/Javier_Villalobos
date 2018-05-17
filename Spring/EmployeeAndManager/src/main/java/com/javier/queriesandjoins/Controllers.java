package com.javier.queriesandjoins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Controllers {
	
	private final EmployeeService es;
	
	public Controllers(EmployeeService es) {
		this.es= es;
	}
	
	@RequestMapping("/")
	public void index() {
		es.test();
	}
}
