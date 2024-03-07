package javaCollectionExamples;

import java.util.ArrayDeque;
import java.util.Queue;

public class C_QueuesExamples {
	
	public static void main(String[] args) {
		
		
		Queue<String> queue = new ArrayDeque<String>();
		
		System.out.println(queue);
		
		queue.offer("1st Man");
		queue.offer("2nd Man");
		queue.offer("3rd Man");
		
		System.out.println( "Q = "+ queue);
		System.out.println("Q peek = "+queue.peek());
		
		queue.poll();
		System.out.println("poll Q = "+queue);
		
		System.err.println("------------------------------");
		
		Queue<String> PriorityQueue = new java.util.PriorityQueue<String>(); //ArrayDeque<String>();
		
		System.out.println("Priority Q = "+PriorityQueue);
		
		PriorityQueue.offer("1st Man");
		PriorityQueue.offer("2nd Man");
		PriorityQueue.offer("3rd Man");
		
		System.out.println("Priority Q = "+PriorityQueue);
		System.out.println("Priority Q peek = "+PriorityQueue.peek());
		
		PriorityQueue.poll();
		System.out.println("Poll Priority Q = "+PriorityQueue);
		
		
	}

}
