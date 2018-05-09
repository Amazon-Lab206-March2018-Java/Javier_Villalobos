package com.javier.grouplanguages.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javier.grouplanguages.models.Language;
import com.javier.grouplanguages.repositories.LanguageRepo;

@Service
public class LanguageService {

	private LanguageRepo languageRepo;
	public LanguageService(LanguageRepo languageRepo) {
		this.languageRepo=languageRepo;
	}
	
	public void addLanguage(Language language) {
		languageRepo.save(language);
	}
	
	public List<Language> allLanguages(){
        return (List<Language>) languageRepo.findAll();
    }
	
	public Language findLanguage(String id) {
        Optional<Language> optionalLanguage = languageRepo.findById(Long.parseLong(id));
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
	}
	
	public void updateLanguage(Language language) {
		languageRepo.save(language);
	}
	public void deleteLanguage(String id) {
		languageRepo.deleteById(Long.parseLong(id));
	}
	

}
