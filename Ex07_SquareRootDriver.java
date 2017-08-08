package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex07_SquareRootDriver {

	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		double n;

		Ex07_SquareRootFinder sqrt = new Ex07_SquareRootFinder();

		do {
			System.out.print("Enter a number (or <= 0 to quit): ");
			n = kb.nextDouble();

			if (n > 0) {
				sqrt.setNumber(n);
				System.out.println(sqrt.getRoot());
			}
		} while (n > 0);

	}

}
