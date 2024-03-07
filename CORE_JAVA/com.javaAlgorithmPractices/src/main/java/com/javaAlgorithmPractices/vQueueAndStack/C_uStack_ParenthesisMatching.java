package com.javaAlgorithmPractices.vQueueAndStack;

import java.util.Stack;

/**
 * 
 * This example is implemented using Stack
 * 
 * (Hello((a+b)-c)) // matching.
 * ((((((((Hello((a+b)-c))	// not matching
 * (Hello((a+b)-c))))))))	// not matching
 * 
 */
public class C_uStack_ParenthesisMatching {
	
	public static boolean hasParenthesisMatching(String str) {
		
		Stack<String> stack = new Stack<String>();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push("(");
			}else if (str.charAt(i) == ')') {
				
				if (!stack.isEmpty()) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	/**
	 * Same implemented using integer;
	 * @param str
	 * @return
	 */
public static boolean hasParenthesisMatching2(String str) {
		
		int matchingSymbolTracker = 0;
		
		
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				matchingSymbolTracker++;
			}else if (str.charAt(i) == ')') {
				
				if (matchingSymbolTracker!=0) {
					matchingSymbolTracker--;
				}else {
					return false;
				}
			}
		}
		
		return matchingSymbolTracker ==0;
	}

	public static void main(String[] args) {
		
		System.out.println("------");
		
		System.out.println(hasParenthesisMatching("(Hello())"));
		System.out.println(hasParenthesisMatching("((((((Hello())"));
		System.out.println(hasParenthesisMatching("((Hello())))))"));
		System.out.println("------");
		System.out.println(hasParenthesisMatching2("(Hello())"));
		System.out.println(hasParenthesisMatching2("((((((Hello())"));
		System.out.println(hasParenthesisMatching2("((Hello())))))"));
		
	}

}
