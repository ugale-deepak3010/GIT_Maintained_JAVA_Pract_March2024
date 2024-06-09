package E_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class B_CreatingStream {

	public static void main(String[] args) {

		System.out.println("--");

		String[] namesArr = { "Deepak", "Manali", "Akanksha", "Anjali", "Ankita", "Pooja" };
		List<String> namesList= Arrays.asList(namesArr);
		
		//	1. creating stream based on Array.
		Stream<String> ArrStream= Arrays.stream(namesArr);
		
		//	2. Create Stream based on collection.
		Stream<String> CollStream= namesList.stream();
		
		//	3. Create Stream using generate method.
		Stream<Integer> generateStream= Stream.generate(()->	5).limit(10);
		
		//	4. Create 	using iterator.
		Stream<Integer> iteratorStream= Stream.iterate(1, x->x+2).limit(10);
		
		ArrStream.forEach(name->System.out.println(name));
		CollStream.forEach(name->System.out.println(name));
		generateStream.forEach(name->System.out.println(name));
		iteratorStream.forEach(name->System.out.println(name));
	}

}
