package com.javier.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javier.dojosandninjas.models.Dojo;
import com.javier.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

	private final DojoRepository dojoRepository;
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	
	public void addDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
	public List<Dojo> findAll(){
		return dojoRepository.findAll();
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> dojo = dojoRepository.findById(id);
		return dojo.get();
	}
}
