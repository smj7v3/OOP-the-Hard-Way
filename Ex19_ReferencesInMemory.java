package com.smj7v3.exercises;

import java.util.ArrayList;
import java.util.Scanner;

class Example {
	
}

public class Ex19_ReferencesInMemory {

	public static void main(String[] args) {
		
//		int age = 41;
//		String name = "Gosling";
		
		int[] digits = new int[]{3, 1, 4, 1, 5, 9, 2};
		for (int num : digits) {
			System.out.print(num + " ");
			
		}
//		Scanner keyboard = new Scanner(System.in);
//		ArrayList arr = new ArrayList();
		Integer year = new Integer(1995);
		System.out.println("\n" + year);
//		Object obj = new Object();
//		Example ex = new Example();
		
		//System.out.println(digits);
//		System.out.println(obj);
//		System.out.println(ex);
//		System.out.println();
//		
//		String[] names = {"John", "Paul", "George", "Ringo", "Brian"};
//		System.out.println(names);
	}

}
