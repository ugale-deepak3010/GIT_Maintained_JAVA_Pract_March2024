package javaCollectionExamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class B_StacksExamples {
	
	
	public static void main(String[] args) {
		
		
		Deque<String> stack = new ArrayDeque<String>();
		
		stack.push("Book 1");
		stack.push("Book 2");
		stack.push("Book 3");
		
		System.out.println(stack);
		System.out.println("peek or top = "+stack.peek());
		
		stack.push("Book 4");
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		stack.poll();	// similar to pop but it's not generate exception if stack is empty.
		System.out.println(stack);
		
		
		
		
	}

}
