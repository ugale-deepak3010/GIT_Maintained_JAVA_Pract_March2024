package StreamPacks;

import java.util.stream.Stream;

public class A_Stream {

	public static void main(String[] args) {
		
		System.out.println("---");
		
		String[] names = {"Deepak", "Manali", "Prajakta", "Akanksha"};

		Stream<String> namesStream = Stream.of(names);
		
		namesStream
		.sorted()
		.forEach(name->System.out.println(name));
		
		Stream<String> nameStream2 = Stream.of(names);
		
		System.err.println("----------");
		nameStream2.forEach(System.out::println);
		
		
		
		
	}

}
