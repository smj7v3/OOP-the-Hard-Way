package com.smj7v3.exercises;

public class Ex04_TVActorDriver {

	public static void main(String[] args) {
		Ex04_TVActor a = new Ex04_TVActor();
		a.name = "Thomas Middleditch";
		a.role = "Richard Hendricks";
		
		Ex04_TVActor b = new Ex04_TVActor();
		b.name = "Martin Starr";
		b.role = "Bertram Gilfoyle";
		
		Ex04_TVActor c = new Ex04_TVActor();
		c.name = "Kumail Nanjiani";
		c.role = "Dinesh Chugtai";
		
		System.out.println(a.name + " played " + a.role);
		System.out.println(b.name + " played " + b.role);
		System.out.println(c.name + " played " + c.role);
	}
}
