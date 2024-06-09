package StreamAPIPract;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B_Stream_FindNameStartWithA {

	public static void main(String[] args) {

		System.out.println("-------");

		Stream<String> nameStream = Stream.of("Anita", "Manali", "Prajakta", "Ankita", "Anjali", "Akanksha");

		List AnameList = nameStream
							.filter(name -> name.startsWith("A"))
							.collect(Collectors.toList());
		
		
		System.out.println(AnameList);
		// .forEach(name->System.out.println(name));

	}

}
