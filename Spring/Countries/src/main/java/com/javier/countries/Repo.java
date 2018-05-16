package com.javier.countries;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Country, Long>{
	
	@Query("SELECT d.name,l.language,l.percentage FROM Country d JOIN d.languages l WHERE l.language = 'Slovene' ORDER BY l.percentage DESC")
	List<Object[]> first();
	
	@Query("SELECT d.name,COUNT(city) FROM Country d JOIN d.cities city GROUP BY d.name ORDER BY COUNT(city) DESC")
	List<Object[]> second();
	
	@Query("SELECT city.name FROM Country d JOIN d.cities city WHERE d.name = 'Mexico' AND city.population > 500000 ORDER BY city.population DESC")
	List<String> third();
	
	@Query("SELECT c.name, l.language FROM Country c JOIN c.languages l WHERE l.percentage > 89.0 ORDER BY l.percentage DESC")
	List<Object[]> fourth();
	
	@Query("SELECT c.name FROM Country c WHERE c.surfaceArea < 501 AND c.population > 100000")
	List<String> fifth();
	
	@Query("SELECT c.name FROM Country c WHERE c.governmentForm = 'Constitutional Monarchy' AND c.surfaceArea > 200 AND c.lifeExpectancy > 75")
	List<String> sixth();
	
	@Query("SELECT c.name, city.name, city.district, city.population FROM Country c JOIN c.cities city WHERE c.name = 'Argentina' AND city.district = 'Buenos Aires' AND city.population > 500000")
	List<Object[]> seventh();
	
	@Query("SELECT c.region, COUNT(c) FROM Country c GROUP BY c.region ORDER BY COUNT(c) DESC")
	List<Object[]> eight();
	
}
