package com.kishore.string;

public class XPlus_XMinus {

	public static void main(String[] args) {
		String[] operations = { "--X", "X++", "X++" };
		finalValueAfterOperations(operations);
	}

	public static void finalValueAfterOperations(String[] operations) {
		int x = 0;

		for (int i = 0; i < operations.length; i++) {
			if (operations[i].equals("++X") || operations[i].equals("X++")) {
				x = x + 1;
			} else {
				x = x - 1;
			}
		}

		System.out.println(x);
	}

}
