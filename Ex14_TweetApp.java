package com.smj7v3.exercises;

public class Ex14_TweetApp {

	public static void main(String[] args) {
		Ex14_Tweet t = new Ex14_Tweet("Thu Feb 19 20:29:00 +0000 2105", 8, true, 568507566168223744L,
				2, true, "You can now buy 'Learn Java the Hard Way' using bitcoin! Probably!" + 
				"\nThanks, @stripe ! #jthw");
		
		System.out.println(t.toString());
		System.out.println("\n------------------------\n");
		System.out.println(t);
	}

}
