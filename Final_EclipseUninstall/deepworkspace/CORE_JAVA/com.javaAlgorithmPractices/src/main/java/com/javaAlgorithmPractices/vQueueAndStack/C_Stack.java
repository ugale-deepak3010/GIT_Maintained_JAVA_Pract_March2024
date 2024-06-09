package com.javaAlgorithmPractices.vQueueAndStack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class C_Stack {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>(); // [First, Second, Third, Fourth]
		
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		
		System.out.println(stack);
		
		
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println(stack);
		
		
		System.err.println("------- using DeQueue -----------");
		
		Deque<String> stack2 = new LinkedList<String>(); //[Fourth, Third, Second, First]

		stack2.push("First");
		stack2.push("Second");
		stack2.push("Third");
		stack2.push("Fourth");
		
		System.out.println(stack2);
		
		
		System.out.println(stack2.peek());
		
		stack2.pop();
		System.out.println(stack2);
		
		System.out.println(stack2.peek());
		
		stack2.pop();
		System.out.println(stack2);
		
		
		
		

	}

}
