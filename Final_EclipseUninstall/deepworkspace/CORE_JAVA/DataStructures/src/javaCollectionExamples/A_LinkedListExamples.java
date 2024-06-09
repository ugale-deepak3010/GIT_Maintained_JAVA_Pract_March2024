package javaCollectionExamples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class A_LinkedListExamples {

	public static void main(String[] args) {

		LinkedList<String> shopingList = new LinkedList<>();
		shopingList.add("apple");
		shopingList.add("Mango");
		shopingList.add("banana");
		
		System.out.println(shopingList);
		
		shopingList.add(1, "Maggie");
		System.out.println(shopingList);
		
		shopingList.addFirst("tomato");
		System.out.println(shopingList);
		
		List<String> synchonizedShopList = Collections.synchronizedList(shopingList);
		
		shopingList.remove(2);
		System.out.println(synchonizedShopList);
		
		synchonizedShopList.remove(2);
		System.out.println(shopingList);

	}

}
