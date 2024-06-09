package StreamAPIPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * JDK: introduced in jdk 1.8 usage: Operation & processing data
 * 
 * Sort Group Max Min AVG filter
 * 
 * two types of Stream Java.util. operations Array, List, Set Java.io Files
 * related operation.
 * 
 * 
 * We can create using two methods of() stream()
 * 
 * 
 * 
 */
public class A_StreamCreation {

	public static void main(String[] args) {

		Stream way1 = Stream.of(1, 2, 3, 4);	// given elements.
		Stream<Integer> way1_recommended = Stream.of(1, 2, 3, 4);
		
		List arrList = new ArrayList();
		arrList = Arrays.asList(1, 2, 3, 4);

		Stream way2 = arrList.stream();			// already have data then use it

	}

}
