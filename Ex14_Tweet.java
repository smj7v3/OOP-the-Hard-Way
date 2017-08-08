package com.smj7v3.exercises;

public class Ex14_Tweet {
	private String created_at;
	private int favorite_count;
	private boolean favorited;
	private long id;
	private int retweet_count;
	private boolean retweeted;
	private String text;

	public Ex14_Tweet(String created_at, int favorite_count, boolean favorited, long id, int retweet_count, boolean retweeted, String text) {
		this.created_at = created_at;
		this.favorite_count = favorite_count;
		this.favorited = favorited;
		this.id = id;
		this.retweet_count = retweet_count;
		this.retweeted = retweeted;
		this.text = text;
	}
	
	public String toString() {
		String out = "";
		out += text + "\n";
		if (retweet_count > 0) {
			out += "Retweets: " + retweet_count + "  ";
		}
		if (this.favorite_count > 0) {
			out += "Favorites: " + this.favorite_count + "\n";
		}
		else {
			out += "\n";
		}
		out += created_at + "\n";
		if (this.retweeted) {
			out += "[^v]";
		}
		else {
			out += "[  ]";
		}
		if (favorited) {
			out += "[*]";
		}
		else {
			out += "[  ]";
		}
		return out;
	}

}
