package com.javier.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javier.productsandcategories.models.Category;
import com.javier.productsandcategories.models.Product;
import com.javier.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {

	private final CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findCategory(Long id){
		Optional<Category> category= categoryRepository.findById(id);
		return category.get();
	}
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	
	public void update(Category category, Product product) {
		category.updateProducts(product);
		categoryRepository.save(category);
	}
	
}

