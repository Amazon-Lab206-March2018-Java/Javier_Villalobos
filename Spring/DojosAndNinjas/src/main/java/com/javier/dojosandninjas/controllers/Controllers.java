package com.javier.dojosandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javier.dojosandninjas.models.Dojo;
import com.javier.dojosandninjas.models.Ninja;
import com.javier.dojosandninjas.services.DojoService;
import com.javier.dojosandninjas.services.NinjaService;

@Controller
public class Controllers {
	
	private final NinjaService ninjaService;
	private final DojoService dojoService;
	
	public Controllers(DojoService dojoService,NinjaService ninjaService ) {
		this.ninjaService= ninjaService;
		this.dojoService= dojoService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/dojos/new";
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		return "newDojo.jsp";
	}
	@PostMapping("/dojos/new")
	public String createNwDojo(@ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		dojoService.addDojo(dojo);
		return "redirect:/";
	}
	
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, BindingResult result,Model model) {
		model.addAttribute("dojos",dojoService.findAll());
		return "newNinja.jsp";
	}
	@PostMapping("/ninjas/new")
	public String createNewNinja(@ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		ninjaService.addNinja(ninja);
		System.out.println(ninja.getId());
		return "redirect:/dojos/"+ninja.getDojo().getId();
	}
	
	@RequestMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id,Model model) {
		model.addAttribute("ninjas", dojoService.findDojo(id));
		return "showDojo.jsp";
	}

}
