package com.javier.models;

public class Cat extends Animal implements Pet{

	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAffection() {
		
		return "Your "+breed+" cat, " + name+", looked at you with some affection, You think";

		
	}

}
