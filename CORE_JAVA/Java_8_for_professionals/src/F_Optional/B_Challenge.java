package F_Optional;

import java.util.Optional;

public class B_Challenge {

	public static void main(String[] args) {

		System.out.println("--");

		//	CHALLENGE - Create empty optional type as String
		Optional<String> stringOptional = Optional.empty();
		
		
		//	CHALLENGE - Create optional type as Integer with value 89
		Optional<Integer> integerOptional = Optional.of(89);//change to 88
		
		// 	CHALLENGE - get value if not then default name
		String name= stringOptional.orElse("Deepak");
		
		// 	CHALLENGE - filter the number and get only odd number else throw the exception.
		integerOptional.filter(n->n%2 != 0).orElseThrow(()->new NullPointerException("Null value found!"));
		
		//	CHALLENGE -  get number higher of 1
		int n1 = integerOptional.map(n->n+1).get();
		System.out.println(n1);
	}

}
