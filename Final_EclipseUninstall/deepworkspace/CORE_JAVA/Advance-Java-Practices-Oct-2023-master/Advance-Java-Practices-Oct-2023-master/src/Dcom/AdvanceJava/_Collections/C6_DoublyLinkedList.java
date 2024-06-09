package Dcom.AdvanceJava._Collections;

import java.util.LinkedList;

/*

Linked List:
	each item holds prev AND Next item address.

Very Quick for inserting & Removing elements from list.
if want to insert list item in middle, linked list faster than arrayList.
if want read only then array list is faster.

more memory takes compared array list.
 */

public class C6_DoublyLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("C");
		
		list.add(1,"B");
		System.out.println(list);
		
		list.remove("A"); 		// QUEUE example now B is first position.
		list.poll();	// remove the head from Queue. "B"
		System.out.println(list);
		
	}

}
