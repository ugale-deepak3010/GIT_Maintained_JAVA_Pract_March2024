package E_StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * <pre>
 * 
 * Intermediate operations are optional for stream.
 * 
 * Operations between source and terminal.
 * 
 * filter 
 * map 
 * flatmap 
 * peek
 * limit 
 * skip 
 * distinct
 * sorted
 * 
 * </pre>
 * 
 */
public class D_Intermediate_Operations {

	public static void main(String[] args) {
		System.out.println("--");

		String[] namesArr = { "Deepak", "Manali", "Akanksha", "Anjali", "Ankita", "Pooja" };
		List<String> namesList = Arrays.asList(namesArr);

		// filter(predicate)

		Arrays.stream(namesArr)
			.filter((name) -> name.startsWith("M"))
			.forEach((name) -> System.out.println(name));

		// map
		Arrays.stream(namesArr)
			.map((name) -> name + " !")
			.forEach((name) -> System.out.println(name));
		
		
		
		//flatmap
		/**
		 *  <R> Stream <R> flatMap(Function <? super T, ?extends Stream<?extends R>> mapper)
		 *  
		 *  Returns a stream  with the elements of all collections on the stream as a separate
		 *  elements on the stream, removing the collection layer.
		 */
		
		String[][] ArrayNames2D= {namesArr, namesArr};
		
		String[] ArrayNames1D= Stream.of(ArrayNames2D)
									.flatMap(arr->Stream.of(arr))	// it returns stream
									.peek(s->System.err.println(s))
									.toArray(size-> new String[size]);
		
		for (String name : ArrayNames1D)
			System.out.println("1D arr: "+name);
		
		
		//	limit and skip and distinct
		String[] numArrStrings= {"One","Two","Three","Four","Five","Six","Six","One","Nine"};
		
		Arrays.stream(numArrStrings).limit(4).forEach(num->System.out.println("Limit: "+num));
		Arrays.stream(numArrStrings).skip(2).forEach(num->System.out.println("Skip: "+num));
		Arrays.stream(numArrStrings).skip(1).limit(3).forEach(num->System.out.println("Limit&Skip: "+num));
		Arrays.stream(numArrStrings).distinct().forEach(num->System.out.println("Distinct: "+num));
		
		//	Sorted & Sorted(comparator)
		
		Arrays.stream(numArrStrings).sorted().forEach(num->System.out.println("Natural Sorted: "+num));
		Arrays.stream(numArrStrings).sorted((a, b)->Integer.compare(a.length(), b.length()))
					.forEach(num->System.out.println("By Length Sorted: "+num));
		
		
	}

}
