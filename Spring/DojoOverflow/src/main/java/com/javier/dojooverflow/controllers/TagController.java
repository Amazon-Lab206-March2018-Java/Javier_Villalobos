package com.javier.dojooverflow.controllers;

import org.springframework.stereotype.Controller;

import com.javier.dojooverflow.services.TagService;

@Controller
public class TagController {
	private final TagService tagService;
	public TagController(TagService tagService) {
		this.tagService=tagService;
	}
}
