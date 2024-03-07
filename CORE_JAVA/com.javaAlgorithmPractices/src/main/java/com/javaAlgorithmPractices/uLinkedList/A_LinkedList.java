package com.javaAlgorithmPractices.uLinkedList;

import java.util.LinkedList;

public class A_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Mango");
		fruits.add("Strawberry");
		fruits.add("Papaya");
		fruits.add("Greps");
		fruits.add("Tomato");
		
		System.out.println( "Mango is there? "+ fruits.contains("Mango"));
		
		System.out.println("What is at last item? "+ fruits.getLast());
	
		System.out.println("What is list size? "+fruits.size());
	
		
		fruits.removeLast();
		
		fruits.forEach(fruit->System.err.println(fruit));
		
	}
}
