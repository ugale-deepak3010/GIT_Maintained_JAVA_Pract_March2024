package StreamAPIPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Intermediate 		= intermediate operations on the string, 
 * 						return new stream 
 * 
 * 	filter() 
 *  map()
 *  flatMap()
 *  skip()
 *  limit()
 *  distinct()
 *  
 * 
 *  Terminal methods
 *  

anyMatch()
allMatch()
noneMatch()
collect()
count()
findAny()
findFirst()
forEach()
min()
max()
reduce()
toArray()

 * 
 * 
 */


public class A1_StreamCommonMethods {

	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
		
		List<Integer> numList = new ArrayList<Integer>();
		numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Stream<Integer> stream = numList.stream();
		
		stream.filter(num->num%2==0).forEach(num->System.out.println(num));
		
		stream1
		.filter(num->num%2==0)
		.forEach(num->System.out.println(num));
		
		
		


		
		
	
		
		
	}

}
