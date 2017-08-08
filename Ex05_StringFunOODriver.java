package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex05_StringFunOODriver {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		System.out.print("Enter a message: ");
		String msg = keyboard.nextLine();

		Ex05_StringFunObject sfo = new Ex05_StringFunObject();
		sfo.setMessage(msg);
		sfo.reverse();
		//sfo.remove();
		sfo.camelCase();

		System.out.println(sfo.getMessage());
	}

}
