package com.javaAlgorithmPractices.tArraysAlgo;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.function.IntPredicate;
import java.util.stream.Stream;

/**
 * Aggregate means combine two arrays based on +-/* or others.<br>
 */
public class C_AggregateAndFilterArray {

	public static int[] findEvenNumbers(int[] firstArr, int[] secondArr) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < firstArr.length; i++)
			if (firstArr[i] % 2 == 0)
				result.add(firstArr[i]);

		for (int i = 0; i < secondArr.length; i++)
			if (secondArr[i] % 2 == 0)
				result.add(secondArr[i]);

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	public static int[] findEvenNumbers2(int[] firstArr, int[] secondArr) {

		//IntPredicate isEvenPredicate = (num) -> num % 2 == 0;

		return Stream.of(firstArr, secondArr)
				.flatMapToInt(Arrays::stream)
				.filter((num)-> num%2==0)			
				//.filter(isEvenPredicate)
				.toArray();
	}

	public static void main(String[] args) {

		int[] num1 = { -9, 3, 2, -8, 12, -16 };
		int[] num2 = { 0, -3, -8, -35, 40, 20, 7 };

		Arrays.stream(findEvenNumbers(num1, num2)).forEach(System.out::println);

		System.err.println("-------------------------------------");
		Arrays.stream(findEvenNumbers2(num1, num2)).forEach(System.out::println);
		

	}

}
