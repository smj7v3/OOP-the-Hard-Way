package com.smj7v3.exercises;

public class Ex06_PhraseRepeater {
	
	String phrase;
	int repeats;
	
	public void setValues(String p, int r) {
		phrase = p;
		repeats = r;
	}
	
	public String getRepeatedPhrase() {
		String result = "";
		for (int i = 0; i < repeats; i++) {
			result += phrase;
		}
		return result;
	}

}
