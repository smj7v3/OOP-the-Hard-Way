package com.smj7v3.exercises;

import java.util.ArrayList;

public class Ex21_GenericsVsCasts {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList objarr = new ArrayList();
		
		objarr.add("one");
		objarr.add("two");
		
		Object aa = objarr.get(0);
		Object bb = objarr.get(1);
		
		String ss = (String)objarr.get(0);
		String tt = (String)objarr.get(1);
		
		System.out.println(objarr);
		
		
		
		ArrayList<String> strarr = new ArrayList<>();
		strarr.add("one");
		strarr.add("two");
		
		String s = strarr.get(0);
		String t = strarr.get(1);
		
		System.out.println(strarr);
		
		Object a = strarr.get(0);
		Object b = strarr.get(1);
		
		
		
		Integer i = new Integer(123);
		objarr.add(i);
		
		System.out.println(objarr);
		
		
	}

}
