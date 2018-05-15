package com.javier.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javier.dojooverflow.models.Question;
import com.javier.dojooverflow.repositories.QuestionRepository;

@Service 
public class QuestionService {
	private final QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public List<Question> findAll(){
		return questionRepository.findAll();
	}
	
	public void addQuestion(Question question) {
		questionRepository.save(question);
	}
	
	public Question findQuestion(Long id) {
		Optional<Question> question= questionRepository.findById(id);
		return question.get();
	}
}
