package com.kishore.string;

public class Max_Num_Words_Found_in_Sentences {

	public static void main(String[] args) {
		String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
		returnCount(sentences);
	}

	private static void returnCount(String[] sentences) {
		int count = 0;

		for (int i = 0; i < sentences.length; i++) {
			String[] words = sentences[i].split(" ");
			if (count < words.length) {
				count = words.length;
			}
		}
		
		System.out.println(count);
	}

}