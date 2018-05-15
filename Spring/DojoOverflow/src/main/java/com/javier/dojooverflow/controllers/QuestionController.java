package com.javier.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javier.dojooverflow.models.Answer;
import com.javier.dojooverflow.models.Question;
import com.javier.dojooverflow.services.QuestionService;
import com.javier.dojooverflow.services.TagService;

@Controller
public class QuestionController {
	
	private final QuestionService questionService;
	private final TagService tagService;
	public QuestionController( QuestionService questionService, TagService tagService) {
		this.questionService= questionService;
		this.tagService=tagService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("questions",questionService.findAll());
		model.addAttribute("tag",tagService.findAll());
		return "dashboard.jsp";
	}
	
	@RequestMapping("/questions/new")
	public String newQuestion(@ModelAttribute("q") Question question, Model model) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/questions/new")
	public String createNewQuestion(@RequestParam("tags") String tags,@Valid @ModelAttribute("q") Question question, BindingResult result) {
		String[] tagList = tags.split(",");
		if(tagList.length>3) {
			result.rejectValue("tags", "error.tags", "You cannot add more than 3 tags");
			}
		if(result.hasErrors()) {
			return "newQuestion.jsp";
		}
		for(String tag: tagList) {
			tagService.addTag(tag,question);
		}
		questionService.addQuestion(question);
		return "redirect:/";
	}
	
	@RequestMapping("/questions/{id}")
	public String showQuestion(@PathVariable("id") Long id,@ModelAttribute("answer") Answer Answer,Model model) {
		
		model.addAttribute("question", questionService.findQuestion(id));
		return "question.jsp";
	}
	
	@PostMapping("/questions/{id}")
	public String addAnswer(@PathVariable("id") Long id,@ModelAttribute("answer") Answer Answer,Model model) {
		
		model.addAttribute("question", questionService.findQuestion(id));
		return "question.jsp";
	}
}
