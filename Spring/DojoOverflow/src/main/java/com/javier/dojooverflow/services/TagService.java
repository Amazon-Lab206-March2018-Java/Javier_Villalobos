package com.javier.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javier.dojooverflow.models.Question;
import com.javier.dojooverflow.models.Tag;
import com.javier.dojooverflow.repositories.TagRepository;

@Service
public class TagService {
	private final TagRepository tagRepository;
	public TagService(TagRepository tagRepository) {
		this.tagRepository=tagRepository;
	}
	
	public List<Tag> findAll(){
		return tagRepository.findAll();
	}
	
	public Tag addTag(String tag, Question question) {
		Tag newTag = new Tag(tag);
		ArrayList<Tag> allTags= (ArrayList<Tag>) question.getTags();
		allTags.add(newTag);
		question.setTags(allTags);
		return newTag;
	}
}
