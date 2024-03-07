package com.javaAlgorithmPractices.vQueueAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class A_Queue {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("one");		// add
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		
		
		System.out.println(queue.poll());	//remove
		
		System.out.println(queue);
		
		System.out.println(queue.peek()); 	// first
	}

}
