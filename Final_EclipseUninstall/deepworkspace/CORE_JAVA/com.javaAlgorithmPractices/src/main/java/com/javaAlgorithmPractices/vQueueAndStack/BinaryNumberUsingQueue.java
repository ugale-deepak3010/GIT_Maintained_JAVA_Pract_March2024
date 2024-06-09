package com.javaAlgorithmPractices.vQueueAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberUsingQueue {

	public static void printBinaryNumbers(int count) {

		if (count <= 0) {
			System.out.println();
			return;
		}

		Queue<Integer> binaryNumQueue = new LinkedList<Integer>();
		binaryNumQueue.offer(1);

		for (int i = 0; i < count; i++) {

			System.out.println(binaryNumQueue.peek());
			int current = binaryNumQueue.poll();
			System.out.println(current);

			binaryNumQueue.offer(current * 10);
			binaryNumQueue.offer((current * 10) + 1);
			
			System.out.println(binaryNumQueue);
		}

		System.out.println();
		System.out.println(binaryNumQueue);

	}

	public static void main(String[] args) {

		printBinaryNumbers(5);
		System.err.println("-------");
		//printBinaryNumbers(9);
	}

}
