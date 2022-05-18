package com.kishore.string;

public class Balanced_String {

	public static void main(String[] args) {
		balanceString("RLRRLLRLRL");
	}

	public static void balanceString(String s) {
		int result = 0, count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'L') {
				count += 1;
			} else {
				count -= 1;
			}

			if (count == 0) {
				result += 1;
			}
		}

		System.out.println(result);
	}

}
