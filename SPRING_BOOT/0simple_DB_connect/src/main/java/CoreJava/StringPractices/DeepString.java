package CoreJava.StringPractices;

import java.util.Arrays;

public class DeepString {

	/**
	 * <p>
	 * Reverse words in a given string char[] is primitive type so can't use<br>
	 * toString method! Char[] is collection framework.
	 * </p>
	 */

	public String reverse(String str) {

		char[] charArray = new char[str.length()];
		charArray = str.toCharArray();

		char[] reverseString = new char[str.length()];

		for (int i = charArray.length; i > 0; i--) {

			reverseString[charArray.length - i] = charArray[i - 1];
		}
		
		

		// System.out.println(reverseString);
		String result;// = reverseString.toString();
		// System.out.println(result);

		/*
		 * result = ""; for (char c : reverseString) { result = result + c; }
		 */
		

		// return reverseString.toString();
		
		result = Arrays.toString(reverseString);
		return result;
	}

}
