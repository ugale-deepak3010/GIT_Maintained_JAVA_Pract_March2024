package E_StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <pre>
 * 
 * Lazy stream: in stream there is too many elements so without intermediate operation it's
 * take longer time so we called Lazy 
 * 
 * Only one terminal in each stream.
 * We need terminal operation to complete the pipeline 
 * Not executed until terminal operation is called.
 * 
 * 
 * common:
 * 
 * forEach
 * min 
 * count 
 * max 
 * allMatch
 * anyMatch 
 * collect 
 * noneMatch
 * </pre>
 */
public class C_TerminalOperations {

	public static void main(String[] args) {

		String[] namesArr = { "Deepak", "Manali", "Akanksha", "Anjali", "Ankita", "Pooja" };
		List<String> namesList = Arrays.asList(namesArr);

		Arrays.stream(namesArr).forEach((name) -> System.out.println(name));

		Long countOfEle = Arrays.stream(namesArr).count();
		System.out.println(countOfEle);

		boolean allNonEmpty = Arrays.stream(namesArr).allMatch((name) -> name.length() != 0);
		System.out.println("allNonEmpty: " + allNonEmpty);

		boolean any5char = Arrays.stream(namesArr).anyMatch((name) -> name.length() == 5);
		System.out.println("any5char " + any5char);

		boolean noneMatching = Arrays.stream(namesArr).anyMatch((name) -> name.startsWith("z"));
		System.out.println("none match start with 'z': " + noneMatching);

		Optional<String> minName = Arrays.stream(namesArr).min((a, b) -> a.compareTo(b));
		System.out.println(minName);// Ak

		Stream<Integer> numbersStream = Stream.iterate(1, x -> x * 3).limit(5);
		Optional<Integer> maxNum = numbersStream.max((a, b) -> a.compareTo(b));

		System.out.println(maxNum);

		// numbersStream.forEach((n)->System.out.println(n));
		// Optional<Integer> minx= numbersStream.min((x,y)->Math.min(x, y));

		// collect & reduce

		List moreThan5CharNameList = Arrays.stream(namesArr).filter((name) -> name.length() > 5)
				.collect(Collectors.toList());

		System.out.println(moreThan5CharNameList);
		
		
		
		
		int[] num= {1,2,3,4,5};
		Stream<Integer> numStream= Arrays.stream(num).boxed();
		//numStream.forEach((n)->System.out.println(n));
		
		int totalSum= numStream.reduce(0, (x,y)->x+y);
		System.out.println(totalSum);
		
		
		
	}

}
