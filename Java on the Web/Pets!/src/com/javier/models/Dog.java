package com.javier.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAffection() {
		if (weight<30) {
			return name+ " hopped into your lap and cuddled you!";
		}
		else {
			return name+ " curled up next to you!";
		}
		
	}

}
