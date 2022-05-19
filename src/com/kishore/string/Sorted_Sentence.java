package com.kishore.string;

public class Sorted_Sentence {

	public static void main(String[] args) {
		sortSentence("is2 sentence4 This1 a3");
	}

	private static void sortSentence(String s) {
		String[] strArr = s.split(" ");
		String r = "";

		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				String tmp = "";
				if (strArr[i].charAt(strArr[i].length() - 1) > strArr[j].charAt(strArr[j].length() - 1)) {
					tmp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = tmp;
				}
			}
		}

		for (String r1 : strArr) {
			r += r1.substring(0, r1.length()-1)+" ";
		}
		
		System.out.println(r);
	}

}
