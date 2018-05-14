package com.javier.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javier.productsandcategories.models.Category;
import com.javier.productsandcategories.models.Product;
import com.javier.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public Product findProduct(Long id) {
		Optional<Product> product= productRepository.findById(id);
		return product.get();
	}
	
	public void update(Product product, Category category) {
		product.updateCategories(category);
		productRepository.save(product);
	}
	
}
