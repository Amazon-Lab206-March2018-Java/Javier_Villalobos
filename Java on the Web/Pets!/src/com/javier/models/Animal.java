package com.javier.models;

public abstract class Animal {
	protected String name;
	protected String breed;
	protected double weight;
	
	public Animal(String name, String breed, double weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", breed=" + breed + ", weight=" + weight + "]";
	}

}
