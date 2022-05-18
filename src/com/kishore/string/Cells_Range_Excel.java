package com.kishore.string;

public class Cells_Range_Excel {

	public static void main(String[] args) {
		cellsInRange("A1:F4");
	}

	private static void cellsInRange(String s) {
		char alphabet = s.charAt(0);
		for (int i = (int) s.charAt(0); i <= (int) s.charAt(3); i++) {
			char count = (char) s.charAt(1);
			for (int j = (int) s.charAt(1); j <= (int) s.charAt(4); j++) {
				System.out.print(alphabet + " " + count + ", ");
				count++;
			}
			alphabet += 1;
		}

	}

}
