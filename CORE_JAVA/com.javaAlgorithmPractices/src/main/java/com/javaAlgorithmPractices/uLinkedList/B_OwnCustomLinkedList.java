package com.javaAlgorithmPractices.uLinkedList;



/**
 * <code>
 * 
 *  [data_1,Node_2] -> [data_2,Node_3] -> [data_3,Node_4] -> [data_4,null]
 * 
 * 	<hr>  node 1			node 2				node 3			node 4
 * 
 * </code>
 */
public class B_OwnCustomLinkedList {

	public static void main(String[] args) {
		
		B_CustomLinkedList linkedList = new B_CustomLinkedList();
		
		B_Node firstNode = new B_Node(1);
		B_Node secondNode = new B_Node(2);
		B_Node thirdNode = new B_Node(3);
		B_Node fourthNode = new B_Node(4);
		
		linkedList.head = firstNode;
		firstNode.next=secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		fourthNode.next = null;
		
		//-------- understand the above logic -----------
		
		linkedList.displayContent();
		linkedList.deleteBackHalf();
		linkedList.displayContent();
		
	}

}
