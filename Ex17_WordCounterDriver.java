package com.smj7v3.exercises;

public class Ex17_WordCounterDriver {

	public static void main(String[] args) {
		String book = "http://www.gutenberg.org/cache/epub/159/pg159.txt";

		Ex17_WordCounter wc = new Ex17_WordCounter(book);

		System.out.println(wc.getCount("the"));
		System.out.println(wc.getCount("I"));
		System.out.println(wc.getCount("a"));

	}

}
