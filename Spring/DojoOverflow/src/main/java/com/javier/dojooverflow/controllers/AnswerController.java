package com.javier.dojooverflow.controllers;

import org.springframework.stereotype.Controller;

import com.javier.dojooverflow.services.AnswerService;

@Controller
public class AnswerController {
	private final AnswerService answerService;
	public AnswerController(AnswerService answerService) {
		this.answerService=answerService;
	}
}
