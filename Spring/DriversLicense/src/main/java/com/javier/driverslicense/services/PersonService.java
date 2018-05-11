package com.javier.driverslicense.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javier.driverslicense.models.Person;
import com.javier.driverslicense.repositories.PersonRepository;

@Service
public class PersonService {

	
	private final PersonRepository personRepository;
	public PersonService(PersonRepository personRepository) {
		this.personRepository=personRepository;
	}
	
	public void addPerson(Person person) {
		personRepository.save(person);
	}
	
	public List<Person> findAll(){
		return personRepository.findAll();
		
	}
	
	public Person findPerson(Long id) {
		Optional<Person> person = personRepository.findById(id);
		return person.get();
	}
	
	
	
}
