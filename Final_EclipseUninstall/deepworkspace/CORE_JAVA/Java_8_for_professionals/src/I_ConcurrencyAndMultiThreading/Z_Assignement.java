package I_ConcurrencyAndMultiThreading;

//Java code​​​​​​‌​‌​‌‌​‌​‌‌​​‌​​‌‌‌‌​​​​‌ below
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;

public class Z_Assignement {

	public static void main(String[] args) {

		System.out.println("--");
		Answer answer = new Answer();

		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

		// Map<Integer, BigInteger> result = Answer.findAnswer(numbers);

	}

}

//Write your answer here, and then test your code.
//Your job is to implement the findAnswer() method and the FactorialTask class.

class Answer {

	// Change these boolean values to control whether you see
	// the expected result and/or hints.
	static boolean showExpectedResult = true;
	static boolean showHints = true;

	static Map<Integer, BigInteger> findAnswer(List<Integer> numbers) {
		// Your code goes here.
		ExecutorService executor= Executors.newFixedThreadPool(5);
		
		List<Future<Map.Entry<Integer, BigInteger>>> futures= new ArrayList<>();
		
		for (Integer number : numbers) {
			futures.add(executor.submit(new FactorialTask(number)));
		}
		
		Map<Integer, BigInteger> results= new HashMap<Integer, BigInteger>();
		
		for (Future<Map.Entry<Integer, BigInteger>> future : futures) {
			try {
				Map.Entry<Integer, BigInteger> result= future.get();
				results.put(result.getKey(), result.getValue());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		executor.shutdown();
		
		return results;
	}
}

class FactorialTask implements Callable<Map.Entry<Integer, BigInteger>> {

	// Some of your code goes here
	private final Integer number;

	public FactorialTask(Integer number) {
		this.number = number;
	}

	@Override
	public Map.Entry<Integer, BigInteger> call() throws Exception {
		// Your code goes here.

		BigInteger factoral = BigInteger.ONE;
		for (int i = 2; i < number; i++) {
			factoral = factoral.multiply(BigInteger.valueOf(i));
		}
		return new AbstractMap.SimpleEntry(number, factoral);
	}
}
