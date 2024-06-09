package StreamPacks;

import java.util.stream.Stream;

public class B_Stream_MinNumber {

	public static void main(String[] args) {

		System.out.println("--");

		Stream<Integer> numStream= Stream.of(new Integer[]{1,2,3,4,5,6,7});
		
		Integer myInt =  numStream.max((x,y)->x.compareTo(y)).get();
		
		
		System.out.println(myInt);
		
		
		
		
	}
	

}
