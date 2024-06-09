package I_ConcurrencyAndMultiThreading;

//Java code​​​​​​‌​‌​‌‌​‌​‌‌​​‌​​‌‌‌‌​​​​‌ below
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;


public class Z_Assignement2 {

	public static void main(String[] args) {

		System.out.println("--");
		Answer answer= new Answer();
		
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
		
		
		 //Map<Integer, BigInteger> result = Answer.findAnswer(numbers);
		
	}

}




//Write your answer here, and then test your code.
//Your job is to implement the findAnswer() method and the FactorialTask class.

class Answer2 {

 // Change these boolean values to control whether you see
 // the expected result and/or hints.
 static boolean showExpectedResult = true;
 static boolean showHints = true;

 static Map<Integer, BigInteger> findAnswer(List<Integer> numbers) {
     // Your code goes here.
     return null;
 }
}

class FactorialTask2 implements Callable<Map.Entry<Integer, BigInteger>> {

 // Some of your code goes here

 @Override
 public Map.Entry<Integer, BigInteger> call() throws Exception {
     // Your code goes here.
     return null;
 }
}

