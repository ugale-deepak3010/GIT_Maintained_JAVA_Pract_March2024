package javaCollectionExamples;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class E_CollectionsExcersize {

	

	public void addEndOfTheLinkedList(LinkedList<Integer> linkedList, int newNum) {

		linkedList.add(newNum);
	}

	public void addToStartOfLinkedList(LinkedList<Integer> linkedList, int startNum) {

		linkedList.addFirst(startNum);
	}

	public void removeItemFromTopOfStack(Deque<Integer> stack) {

		stack.poll();// pop() generate exception if stack is empty!
	}

	public void removeItemFromFrontOfQueue(Queue<Integer> queue) {

		queue.remove();
	}

	public void addItemToTreeSet(Set<String> treeSet, String item) {
		treeSet.add(item);
	}

}
