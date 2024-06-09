package javaCollectionExamples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class F_CollectionsExcersizeTest {

	private E_CollectionsExcersize c = new E_CollectionsExcersize();

	@Test
	public void testAddEndOfTheLinkedList() {

		System.out.println("hello");

		LinkedList<Integer> myNumLinkedList = new LinkedList<Integer>();

		myNumLinkedList = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		c.addEndOfTheLinkedList(myNumLinkedList, 6);

		System.out.println(myNumLinkedList.getLast());

		assertEquals(Long.valueOf(6), Long.valueOf(myNumLinkedList.getLast()));

		c.addToStartOfLinkedList(myNumLinkedList, 0);
	}

	@Test
	public void testAddToStartOfLinkedList() {

		LinkedList<Integer> myNumIntegers = new LinkedList<Integer>();

		myNumIntegers = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		c.addToStartOfLinkedList(myNumIntegers, 0);

		assertEquals(Long.valueOf(0), Long.valueOf(myNumIntegers.getFirst().toString()));
	}

	@Test
	public void testRemoveItemFromTopOfStack() {
		
		Deque<Integer> stack = new ArrayDeque<Integer>();

		stack.push(23); // = new ArrayDeque<Integer>( Arrays.asList(23,56,12,67));
		stack.push(56);
		stack.push(12);
		stack.push(67);

		//System.out.println(stack);
		c.removeItemFromTopOfStack(stack);// stack.poll();/pop()
		//System.out.println(stack);

		assertEquals(Integer.valueOf(12), stack.peek());
	}
	
	
	@Test
	public void testRemoveItemFromFrontOfQueue() {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		
		System.out.println(queue);
		c.removeItemFromFrontOfQueue(queue);
		System.out.println(queue);
		
		assertEquals(Integer.valueOf(2), queue.peek());		
	}
	
	@Test
	public void testAddItemToTreeSet() {
		
		Set<String> treeSet= new TreeSet<String>(Comparator.comparing(String::length));
		treeSet.add("one");
		treeSet.add("two_");
		c.addItemToTreeSet(treeSet, "three");
		c.addItemToTreeSet(treeSet, "I");
		System.err.println("-----------------");
		System.out.println(treeSet);
		
		assertTrue(treeSet.contains("three"));
	}
	
	
	

}
