package com.javier.grouplanguages.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
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
		List<Language> languages = languageService.allLanguages();
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
        Language language2 = languageService.findLanguage(id);
        if(language != null){
            model.addAttribute("currentLanguage", language2);
            return "edit.jsp";
        } else {
            return "redirect:/";
        }
	}
	@Transactional
    @PostMapping("languages/edit/{id}")
    public String editLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result,@PathVariable Long id) {
        if (result.hasErrors()) {
        	return "edit.jsp";
        }else{
        	language.setId(id);
            languageService.updateLanguage(language);
            return "redirect:/languages";
        }
    }
    
	@RequestMapping("languages/delete/{id}")
	public String deleteLanguage(@PathVariable String id, Model model, @ModelAttribute("language") Language language) {
		languageService.deleteLanguage(id);
		return "redirect:/";
	}
}
