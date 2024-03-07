package com.javaAlgorithmPractices.StringsAlgo;


public class D_ParsingAndSearching {

	public static void parseContent(String s) {

		System.out.println("\nway 1");
		for (char c : s.toCharArray()) {
			System.out.print(c);
		}

		System.out.println("\nway 2");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		System.out.println("--------");
		
		String s= "HeLLow !";
		
		
		
		System.out.println(s.contains("LL"));
		parseContent(s);


	}

}
