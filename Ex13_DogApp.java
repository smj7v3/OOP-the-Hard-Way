package com.smj7v3.exercises;

public class Ex13_DogApp {

	public static void main(String[] args) {
		Ex13_Dog a = new Ex13_Dog();
		
		Ex13_Dog pal = new Ex13_Dog("Lassie", "Rough Collie", 3, 26);
		Ex13_Dog spike = new Ex13_Dog("Yeller", "Mastador", 5, 43);
		
		System.out.println(pal.getName() + " is a " + pal.getBreed() + ".");
		System.out.println(spike.getName() + " is a " + spike.getBreed() + ".");
		
		System.out.println(pal.getEverything());
		System.out.println(a.getEverything());
		
	}

}
