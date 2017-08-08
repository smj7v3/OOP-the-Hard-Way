package com.smj7v3.exercises;

public class Ex12_Rectangle {
	private int length, width;

	public Ex12_Rectangle() {
		length = width = 0;
	}

	public Ex12_Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	public int getArea() {
		return length * width;
	}

}
