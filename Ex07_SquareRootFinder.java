package com.smj7v3.exercises;

public class Ex07_SquareRootFinder {
	
	double n;
	int iterations;
	
	public void setNumber(double number) {
		n = number;
		iterations = 7;
		if (n < 10) {
			iterations++;
		}
	}
	
	public double getRoot() {
		double x = n/4;
		for (int i = 0; i < iterations; i++) {
			x = (x + (n/x))/2.0;
		}
		return x;
	}
		
}
