package com.javier.dojooverflow.services;

import org.springframework.stereotype.Service;

import com.javier.dojooverflow.repositories.AnswerRepository;

@Service
public class AnswerService {
	private final AnswerRepository answerRepository;
	public AnswerService(AnswerRepository answerRepository) {
		this.answerRepository=answerRepository;
	}
}
