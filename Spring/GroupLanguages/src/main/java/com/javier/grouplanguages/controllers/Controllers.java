package com.javier.grouplanguages.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javier.grouplanguages.models.Language;
import com.javier.grouplanguages.services.LanguageService;

@Controller
public class Controllers {
	
	private final LanguageService languageService;
	
    public Controllers(LanguageService languageService){
        this.languageService = languageService;
    }
	
	@RequestMapping("/")
	public String index(@ModelAttribute("language") Language language, Model model) {
		return "redirect:/languages";
	}
	
	@RequestMapping("/languages")
	public String languages(@ModelAttribute("language") Language language, Model model) {
		ArrayList<Language> languages = languageService.allLanguages();
		model.addAttribute("languages",languages);
		return "index.jsp";
	}
	
    // ...
    @PostMapping("/languages/new")
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
        	
        	return "index.jsp";
        }else{
            languageService.addLanguage(language);
            return "redirect:/languages";
        }
    }
    
	@RequestMapping("/languages/{id}")
	public String languages(@PathVariable String id, Model model) {
		model.addAttribute("currentLanguage",languageService.findLanguage(id));
		return "show.jsp";
	}
	@RequestMapping("languages/edit/{id}")
	public String editLanguageRender(@PathVariable String id, Model model, @ModelAttribute("language") Language language) {
		model.addAttribute("currentLanguage",languageService.findLanguage(id));
		return "edit.jsp";
	}
	
    @PostMapping("languages/edit/{id}/submit")
    public String editLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result,@PathVariable String id) {
        if (result.hasErrors()) {
        	return "edit.jsp";
        }else{
            languageService.updateLanguage(id, language);
            return "redirect:/languages";
        }
    }
	@RequestMapping("languages/delete/{id}")
	public String deleteLanguage(@PathVariable String id, Model model, @ModelAttribute("language") Language language) {
		languageService.deleteLanguage(id);
		return "redirect:/";
	}
}
