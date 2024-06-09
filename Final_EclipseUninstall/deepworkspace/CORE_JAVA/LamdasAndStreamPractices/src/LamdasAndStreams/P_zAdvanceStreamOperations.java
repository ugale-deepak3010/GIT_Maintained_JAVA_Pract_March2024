package LamdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 * Stream can only once for use!
 */

public class P_zAdvanceStreamOperations {
	
	public static void main(String[] args) {
		
		
		
//		Integer[] scores= {80, 66, 73, 92, 43};
//		Stream<Integer> scoreStream = Arrays.stream(scores);
//		
		List<String> shoppingList= new ArrayList<String>();
		shoppingList.add("coffee");
		shoppingList.add("bread");
		shoppingList.add("pineapple");
		shoppingList.add("milk");
		shoppingList.add("pasta");
	
		Stream<String> shoppingListStream = shoppingList.stream();

		
		
		//Stream<String> letterStream= Stream.of("a","b","c");
		
		
		System.out.println("---------------");
		shoppingListStream
		.sorted()
		.map(item->item.toUpperCase())
		.filter(item->item.startsWith("P"))
		.forEach(item->System.out.println(item));
		
		System.out.println(shoppingList);
		
		//Error shoppingListStream.forEach(item->System.out.println(item));
		//stream has already been operated upon or closed
		
		List<String> newShoppingList = shoppingList
				.stream()
				.map(item->item.toUpperCase())
				.filter(item->item.startsWith("P"))
				.collect(Collectors.toList());
		
		System.out.println(newShoppingList);
		
	}

}
