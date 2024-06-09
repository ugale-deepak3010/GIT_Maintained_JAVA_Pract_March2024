package LamdasAndStreams;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");

		Function<String, String> printHii = (String name) -> "Hii " + name;

		String myGreetings = printHii.apply("Deepak");

		System.out.println(myGreetings);
	}
}
