package com.javaAlgorithmPractices.StringsAlgo;

public class C_NormalizeString {

	
	public static String normalizeString(String s) {
		
		
	
		
		
//		String lowerString = s.toLowerCase();
//		String trimmed = lowerString.trim(); // removing first & last white space
//		String replacedComma = trimmed.replace(',', ' ');
//		return "";
		
		
		return s.toLowerCase().replace(',', ' ' ).trim();
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("-----");
		System.out.println(normalizeString(" Hello There, BUDDY, "));
	}

}
