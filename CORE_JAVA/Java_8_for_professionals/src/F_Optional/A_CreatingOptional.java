package F_Optional;

import java.util.Optional;

public class A_CreatingOptional {

	public static void main(String[] args) {


		Optional<Integer> optional= Optional.of(89);
		Optional<Integer> optiona2= Optional.empty();
		
		
		System.out.println(optional.isPresent());
		System.out.println(optiona2.isPresent());// empty can't present
		
		Integer i=null;
		
		try {
			Optional<Integer> optional3= Optional.of(i);
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		
		Optional<Integer> optional4= Optional.ofNullable(i);
		System.out.println(optional4.isPresent());// null can't present

	}

}
