package com.javier.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javier.dojosandninjas.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo,Long>{
	
	public List<Dojo> findAll();

}
