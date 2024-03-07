package javaCollectionExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class D_TreeSets {

	public static void main(String[] args) {
		

		LinkedList<Integer> myNumLinkedList = new LinkedList<Integer>();

		myNumLinkedList=new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		
		System.out.println(myNumLinkedList);

		
		
		Set<Integer> ageSetForGym = new TreeSet<Integer>();

		ageSetForGym.add(5);
		ageSetForGym.add(75);
		ageSetForGym.add(50);
		ageSetForGym.add(25);
		ageSetForGym.add(85);

		System.out.println(ageSetForGym);

		Set<String> wordLengthSet = new TreeSet<String>(Comparator.comparing(String::length));

		wordLengthSet.add("I");
		wordLengthSet.add("apple");
		wordLengthSet.add("mango"); // 4 chars length!
		wordLengthSet.add("cat");
		wordLengthSet.add("me");
		wordLengthSet.add("pineapple");

		System.out.println(wordLengthSet);

	}
}
