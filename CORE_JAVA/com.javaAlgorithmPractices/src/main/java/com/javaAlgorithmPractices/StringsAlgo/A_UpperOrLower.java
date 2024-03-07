package com.javaAlgorithmPractices.StringsAlgo;

public class A_UpperOrLower {

	public static boolean isUpper(String s) {
		return s.chars().allMatch(Character::isUpperCase);
	}
	
	public static boolean isLower(String s) {
		return s.chars().allMatch(Character::isLowerCase);
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		
		System.out.println(isLower("DEEPAK"));
		System.out.println(isLower("deepak"));
		
		System.out.println(isUpper("DEEPAK"));
		System.out.println(isUpper("deepak"));
		
	}

}
