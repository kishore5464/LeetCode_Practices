package com.kishore.string;

public class Shuffle_String {

	public static void main(String[] args) {
		String word = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		shuffleString(word, indices);
	}

	private static void shuffleString(String word, int[] indices) {
		String shuffledString = "";

		char[] chArr = new char[indices.length];
		for (int i = 0; i < indices.length; i++) {
			chArr[indices[i]] = word.charAt(i);
		}

		shuffledString = String.valueOf(chArr);

		System.out.println(shuffledString);
	}

}