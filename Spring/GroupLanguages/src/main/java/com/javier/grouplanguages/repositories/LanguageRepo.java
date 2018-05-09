package com.javier.grouplanguages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javier.grouplanguages.models.Language;


public interface LanguageRepo extends CrudRepository<Language,Long>{
	List<Language> findAll();
	
}
