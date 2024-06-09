package com.javaAlgorithmPractices.StringsAlgo;

//String is immutable
// hence need StringBuilder
public class F_Algorithm_Driven_reverseString {

	public static String reverseString(String inputString) {

		if (inputString == null || inputString.isEmpty()) {
			return inputString;
		}

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = inputString.length() - 1; i >= 0; i--) {
			stringBuilder.append(inputString.charAt(i));
		}

		return stringBuilder.toString();
	}

	public static String reverseString2(String reverseString) {
		
		if (reverseString == null || reverseString.isEmpty())
			return reverseString;

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(reverseString);
		return stringBuilder.reverse().toString();

	}

	public static void main(String[] args) {
		System.out.println("--");

		System.out.println(reverseString("Deepak!"));
		System.out.println(reverseString(null));
		System.out.println(reverseString(""));
		
		System.err.println("-------------------------");
		
		System.out.println(reverseString2("Deepak!"));
		System.out.println(reverseString2(null));
		System.out.println(reverseString2(""));
		
		System.out.println("--");
	}

}
