package com.javaAlgorithmPractices.StringsAlgo;

public class B_IsPasswordComplex {

	public static boolean isPasswordComplex(String password) {

		return  password.chars().anyMatch(Character::isUpperCase) && 
				password.chars().anyMatch(Character::isLowerCase) && 
				password.chars().anyMatch(Character::isDigit);
		

	}

	public static void main(String[] args) {

		System.out.println("...Password Complex...");
		
		System.out.println(isPasswordComplex("Aa3"));
		System.out.println(isPasswordComplex("AB3"));
		

	}

}
