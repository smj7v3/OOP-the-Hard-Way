package com.smj7v3.exercises;

public class Ex13_Dog {

	private String name, breed;
	private int age;
	private double weight;

	public Ex13_Dog() {

	}

	public Ex13_Dog(String n, String b, int a, double w) {
		name = n;
		breed = b;
		age = a;
		weight = w;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}
	
	public String getEverything() {
		return name + " is a " + breed + ", " + age + " years old, " + weight + " kg.";
	}

}
