package com.kishore.string;

public class Goal_Parser {

	public static void main(String[] args) {
		interpret("(al)G(al)()()G");
	}

	public static void interpret(String command) {
		String result = command.replace("()", "o").replace("(al)", "al");

		System.out.println(result);
	}

}
