package com.javaAlgorithmPractices.uLinkedList;

public class B_CustomLinkedList {

	B_Node head;

	public void displayContent() {

		B_Node current = head;

		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * Not understood!
	 */
	public void deleteBackHalf() {

		if (head == null || head.next == null) {
			head = null;
		}

		B_Node slow = head;
		B_Node fast = head;
		B_Node prev = null;
		
		System.out.println("slow  = "+ slow.data +"  fast = "
				+ fast.data +" prev = ");
		System.out.println("----");
		while (fast != null && fast.next != null) {
			
			System.out.println("slow  = "+ slow.data +"  fast = "
			+ fast.data +" prev = ");
			
			fast = fast.next.next;	// 	3	//		1->2->3->4->
			prev = slow;			//	1
			slow = slow.next;		//	2
			
		}

		prev.next = null;			//	2

	}
}
