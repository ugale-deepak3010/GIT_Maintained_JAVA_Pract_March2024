package com.javaAlgorithmPractices.StringsAlgo;

public class E_CustomParsingSearching {
	
	public static boolean charAtEvenPos( String search, char item) {
		
		for (int i = 0; i < search.length(); i=i+2 ) {
			if(search.charAt(i)==item) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("--");
		
		System.out.println(charAtEvenPos("HeLLo", 'L'));
		System.out.println(charAtEvenPos("HeLLo", 'T'));
	}

}
