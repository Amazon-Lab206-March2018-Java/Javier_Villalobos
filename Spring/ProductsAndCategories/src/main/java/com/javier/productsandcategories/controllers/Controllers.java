package com.javier.productsandcategories.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javier.productsandcategories.models.Category;
import com.javier.productsandcategories.models.Product;
import com.javier.productsandcategories.services.CategoryService;
import com.javier.productsandcategories.services.ProductService;

@Controller
public class Controllers {

	
	private final ProductService productService;
	private final CategoryService categoryService;
	public Controllers(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/products/new";
	}
	
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/products/new")
	public String createNewProduct(@ModelAttribute("product") Product product, BindingResult result) {
		productService.addProduct(product);
		return "redirect:/";
	}
	@RequestMapping("/categories/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/categories/new")
	public String createNewCategory(@ModelAttribute("product") Category category, BindingResult result) {
		categoryService.addCategory(category);
		return "redirect:/";
	}
	
	@RequestMapping("products/{id}")
	public String addCategory(@PathVariable("id") Long id,@ModelAttribute("category") Category category, Model model) {
		model.addAttribute("product",productService.findProduct(id));
		model.addAttribute("categories", categoryService.findAll());
		return "addCategory.jsp";
	} 
	
	@PostMapping("/categories/{id}/addProduct")
	public String updateProducts(@PathVariable("id") Long id,
			@RequestParam("products") Long prod_id) {
		Product product = productService.findProduct(prod_id);
		Category category = categoryService.findCategory(id);
		categoryService.update(category, product);
		return "redirect:/";
	}
	
	@RequestMapping("categories/{id}")
	public String addProduct(@PathVariable("id") Long id, Model model) {
		model.addAttribute("category",categoryService.findCategory(id));
		model.addAttribute("products", productService.findAll());
		return "addProduct.jsp";
	} 
	
	@PostMapping("/products/{id}/addCategory")
	public String updateCategories(@PathVariable("id") Long id,
			@RequestParam("categories") Long cat_id) {
		Category category= categoryService.findCategory(cat_id);
		Product product = productService.findProduct(id);
		productService.update(product, category);
		return "redirect:/";
	}

}
