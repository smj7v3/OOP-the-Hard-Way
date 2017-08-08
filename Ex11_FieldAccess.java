package com.smj7v3.exercises;

public class Ex11_FieldAccess {
	
	public String first;
	private String last;
	String nick;
	
	public Ex11_FieldAccess() {
		first = last = nick = "";
	}

	public Ex11_FieldAccess(String f, String l, String n) {
		first = f;
		last = l;
		nick = n;
	}
	
	public void setFirst(String s) {
		first = s;
	}
	
	public void setLast(String s) {
		last = s;
	}
	
	public void setNick(String s) {
		nick = s;
	}
	
	public String getFirst() {return first;}
	public String getLast() {return last;}
	public String getNick() {return nick;}
	
	public String getFullName() {
		return first + " \"" + nick + "\" " + last;
	}
	
	public String getName() {
		return first + " " + last;
	}
}
