package com.javier.grouplanguages.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.javier.grouplanguages.models.Language;

@Service
public class LanguageService {

	ArrayList<Language> languages = new ArrayList<Language>();
	
	public void addLanguage(Language language) {
		languages.add(language);
	}
	
	public ArrayList<Language> allLanguages() {
        return languages;
    }
	
	public Language findLanguage(String index) {
		return  languages.get(Integer.parseInt(index));
	}
	
	public void updateLanguage(String id, Language language) {
		languages.set(Integer.parseInt(id), language);
	}
	public void deleteLanguage(String id) {
		languages.remove(Integer.parseInt(id));
	}
}
