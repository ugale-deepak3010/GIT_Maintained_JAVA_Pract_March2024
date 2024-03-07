package com.javaAlgorithmPractices.vQueueAndStack;

import java.util.Stack;

/**
 * This is an example use case for Stack.
 */
public class C_tStack_nextGreaterElement {

	public static void printNextGreaterElement(int[] arr) {

		if (arr.length == 0) {
			System.out.println();
			return;
		}

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);
		

		for (int i = 0; i < arr.length; i++) {
			int nextElement = arr[i];
			
			//System.out.print(" nextEle = "+nextElement);
			if (!stack.isEmpty()) {
				int popped = stack.pop();
				//System.out.print(" popped = "+popped);
				while (popped < nextElement) {
					System.out.println(popped + " -> " + nextElement);
					if (stack.isEmpty()) {
						break;
					}
					popped = stack.pop();
				}
				if (popped > nextElement) {
					stack.push(popped);
					//System.out.print(" pushed (popped) "+popped);
				}
			}
			stack.push(nextElement);
			//System.out.print(" pushed (nextEle) ="+nextElement);
			//System.out.println();
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + "-->" + -1);
		}
		
		//System.err.println(stack);
	}

	public static void main(String[] args) {

		printNextGreaterElement(new int[] { 16, 7, 2, 15 });
	}

}
