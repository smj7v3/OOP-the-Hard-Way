package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex06_PhraseRepeaterDriver {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		
		System.out.print("Enter a message: ");
		String msg = keyboard.nextLine();
		System.out.print("Number of times: ");
		int n = keyboard.nextInt();
		
		Ex06_PhraseRepeater pr = new Ex06_PhraseRepeater();
		pr.setValues(msg, n);
		System.out.println(pr.getRepeatedPhrase());
	}

}
