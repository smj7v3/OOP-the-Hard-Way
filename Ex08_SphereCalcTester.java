package com.smj7v3.exercises;

public class Ex08_SphereCalcTester {

	public static void main(String[] args) {

		Ex09_SphereCalc3 c = new Ex09_SphereCalc3(5);

		//c.setRadius(5);
		

		if (isNear(c.getSurfaceArea(), 314.159265359)) {
			System.out.println("PASS: surfaceArea for " + c.getRadius());
		} else {
			System.out.println("FAIL: surfaceArea not what was expected!");
		}
		if (isNear(c.getVolume(), 523.598775598))
			System.out.println("PASS: volume for " + c.getRadius());
		else {
			System.out.println("FAIL: volume not what was expected!");
		}

		c.setRadius(0.1);
		if (isNear(c.getSurfaceArea(), 0.125663706)) {
			System.out.println("PASS: surfaceArea for " + c.getRadius());
		}
		else {
			System.out.println("FAIL: surfaceArea not what was expected!");
		}
		if (isNear(c.getVolume(), 4.18879E-3)) {
			System.out.println("PASS: volume for " + c.getRadius());
		}
		else {
			System.out.println("FAIL: volume not what was expected!");
		}

	}

	public static boolean isNear(double a, double b) {
		return Math.abs(a - b) < 1E-9;
	}

}
