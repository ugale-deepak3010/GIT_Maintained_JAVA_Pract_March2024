package C_Interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *<pre>
 *Interfaces with only one abstract method provided by java 
 *</pre>
 * 
 */
public class FunctionInterface_Built_In {

	public static void main(String[] args) {

		Predicate<Integer> p= (num)->{
			if(num>=0) {
				return true;
			}else {
				return false;
			}
		};
		
		Predicate<Integer> p2= (num)->(num>=0)?true:false;
		
		System.out.println(p.test(-5));
		System.out.println(p2.test(5));
		
		
		
		Supplier<Integer> s= ()->18;
		
		int ageLimit = s.get();
		
		System.out.println("Election for minimum age: "+ageLimit);
		
		
		Consumer<Integer> disp= (num)->System.out.println("==>>"+num+"<<==");
		
		disp.accept(25);
		
		Function<Integer, Integer> x2= (a)->a*2;
		
		int x= x2.apply(100);
		
		System.out.println(x);
		
	}

}
