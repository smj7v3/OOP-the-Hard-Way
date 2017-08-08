package com.smj7v3.exercises;

public class Ex11_FieldAccessDriver {

	public static void main(String[] args) {
		Ex11_FieldAccess j = new Ex11_FieldAccess("Robert", "Parker", "Butch");
		System.out.println(j.getFullName());
		
		j.setLast("Elliot");
		j.setFirst("Samuel");
		j.setNick("Sam");
		System.out.println(j.getFullName());

		j.setFirst("Avery");
		j.setLast("Markham");
		System.out.println(j.getName());
		
	}

}
