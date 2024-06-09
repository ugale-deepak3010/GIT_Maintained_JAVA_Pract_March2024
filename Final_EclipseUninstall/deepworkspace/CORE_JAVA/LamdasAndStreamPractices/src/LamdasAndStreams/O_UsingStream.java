package LamdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class O_UsingStream {
	
	public static void main(String[] args) {
		
		
		
		Integer[] scores= {80, 66, 73, 92, 43};
		Stream<Integer> scoreStream = Arrays.stream(scores);
		
		List<String> shoppingList= new ArrayList<String>();
		shoppingList.add("coffee");
		shoppingList.add("bread");
		shoppingList.add("pineapple");
		shoppingList.add("milk");
		shoppingList.add("pasta");
	
		Stream<String> shoppingListStream = shoppingList.stream();
		
		
		Stream<String> letterStream= Stream.of("a","b","c");
		
		for (String item : shoppingList) {
			System.out.println(item);
		}
		System.out.println("---------------");
		shoppingListStream
		.sorted()
		.forEach(item->System.out.println(item));
		
	}

}
