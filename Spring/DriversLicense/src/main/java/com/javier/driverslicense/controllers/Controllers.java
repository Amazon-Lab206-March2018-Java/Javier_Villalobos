package com.javier.driverslicense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javier.driverslicense.models.License;
import com.javier.driverslicense.models.Person;
import com.javier.driverslicense.services.LicenseService;
import com.javier.driverslicense.services.PersonService;

@Controller
public class Controllers {
	
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public Controllers(PersonService personService, LicenseService licenseService) {
		this.licenseService=licenseService;
		this.personService=personService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/persons/new";
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person, BindingResult result) {
		return "newPerson.jsp";
	}
	@PostMapping("/persons/new/create")
	public String createNewPerson(@ModelAttribute("person") Person person, BindingResult result) {
		personService.addPerson(person);
		return "redirect:/persons/new";
	}
	
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license, BindingResult result,Model model) {
		model.addAttribute("persons",personService.findAll());
		model.addAttribute("number",String.format("%05o", 1+licenseService.findAll().size()));
		return "newLicense.jsp";
	}
	
	@PostMapping("/licenses/new/create")
	public String createNewLicense(@ModelAttribute("license") License license, BindingResult result) {
		licenseService.addLicense(license);
		return "redirect:/persons/new";
	}
	
	@RequestMapping("/persons/{id}")
	public String showPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", personService.findPerson(id));
		return "showPerson.jsp";
	}
	
	
}
