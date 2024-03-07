package com.javaAlgorithmPractices.StringsAlgo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class G_ReverseWordsFromSentence {

	public static String reverseWordFromSentence(String sentence) {
		if (sentence == null || sentence.isEmpty())
			return sentence;

		sentence = sentence.trim();
		String[] words = sentence.split(" ");
		String reverseSentence = "";

		for (int i = 0; i < words.length; i++) {
			String reverseWord = "";
			for (int j = words[i].length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + words[i].charAt(j);
			}
			reverseSentence = reverseSentence + " " + reverseWord;
		}

		return reverseSentence.trim();
	}

	public static String reverseWordFromSentence2(String sentence) {

		Stream<String> stream;

		String[] words = sentence.split(" ");
		List<String> wordList = Arrays.asList(words);

		stream = wordList.stream();

		return stream.map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));

	}

	public static void main(String[] args) {
		System.out.println(reverseWordFromSentence2("Deepak Ugale"));
	}

}
