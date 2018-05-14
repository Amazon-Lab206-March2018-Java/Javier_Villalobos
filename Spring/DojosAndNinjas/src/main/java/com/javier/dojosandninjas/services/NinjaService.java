package com.javier.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javier.dojosandninjas.models.Ninja;
import com.javier.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	
	private final NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
	public List<Ninja> findAll(){
		return ninjaRepository.findAll();
	}
}
