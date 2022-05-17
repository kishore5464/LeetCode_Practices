package com.kishore.string;

public class Jewels_Stones {

	public static void main(String[] args) {
		jewel_Stone("aA", "aAAbbbb");
	}

	private static void jewel_Stone(String jewel, String stone) {
		int count = 0;

		for (int i = 0; i < jewel.length(); i++) {
			for (int j = 0; j < stone.length(); j++) {
				if (jewel.charAt(i) == stone.charAt(j)) {
					count += 1;
				}
			}
		}

		System.out.println(count);
	}

}