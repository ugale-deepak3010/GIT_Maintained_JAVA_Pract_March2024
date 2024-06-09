package StreamPacks;

import java.util.function.Function;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class JavaFunctionsPrac {

	public static void main(String[] args) {

		Function<String, Integer> strLength = str -> str.length();
		System.out.println(strLength.apply("Deepak"));

		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(6));

		
		
		Consumer<Integer> display = a -> System.out.println(a);
		display.accept(10);

		Supplier<String> greetingSupplier = () -> "Hello Dear";
		System.out.println(greetingSupplier.get());

		
		
		UnaryOperator<Integer> xor = a -> a * 10;
		System.out.println(xor.apply(28));

	}

}
