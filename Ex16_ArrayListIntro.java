package com.smj7v3.exercises;

import java.util.ArrayList;

public class Ex16_ArrayListIntro {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		System.out.println("ArrayList has size(): " + arr.size());
		
		arr.add("Ant-Man");
		arr.add("Hulk");
		arr.add("Iron Man");
		arr.add("Thor");
		arr.add("Wasp");
		
		System.out.println("ArrayList has size(): " +arr.size());
		System.out.println("Current contents: " + arr);
		showList(arr);
		
		arr.add(3, "Jarvis");
		showList(arr);
		
		int i = arr.indexOf("Hulk");
		System.out.println(arr.get(i) + " is located in slot " + i);
		arr.remove(i);
		showList(arr);
		
		arr.add(1, "Captain America");
		showList(arr);
		
		arr.set(1, "Cap");
		showList(arr);
		
		arr.remove(5);
		arr.remove(4);
		arr.remove(2);
		arr.remove(0);
		showList(arr);
		
		arr.add("Hawkeye");
		arr.add("Quicksilver");
		arr.add("Scarlet Witch");
		showList(arr);
		
		i = arr.indexOf("Hawkeye");
		String removed = arr.remove(i);
		arr.add(i - 1, removed);
		showList(arr);
		
		System.out.println("Current contents: " + arr);		
	}
	
	public static void showList(ArrayList<String> a) {
		System.out.println("size() is " + a.size());
		for (int i = 0; i < a.size(); i++) {
			int len = a.get(i).length() + 4;
			System.out.print("|" + centerPad("" + i, len));
		}
		System.out.println("|");
		for (String s : a) {
			System.out.print("| \"" + s + "\" ");
		}
		System.out.println("|\n");
	}
	
	public static String centerPad(String s, int width) {
		int totalSpaces = width - s.length();
		int leftSide = totalSpaces / 2;
		int rightSide = totalSpaces - leftSide;
		String out = "";
		for (int i = 0; i < leftSide; i++) {
			out += " ";
		}
		out += s;
		for (int i = 0; i < rightSide; i++) {
			out += " ";
		}
		return out;
	}

}
