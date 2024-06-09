package com.javaAlgorithmPractices.tArraysAlgo;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Linear search means sequential search.
 */
public class A_LinearSerchInArray {

	public static Integer searchInIntArr(int[] array, int item) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == item) {
				return i;
			}
		}
		return null;
	}

	public static OptionalInt searchInIntArr2(int[] array, int item) {
		return Arrays.stream(array)
				.filter(num -> num == item)
				.findFirst();
	}

	public static void main(String[] args) {

		int[] sequence = { 1, 2, 3, 4 };

		System.out.println(searchInIntArr(sequence, 3));
		System.out.println(searchInIntArr(sequence, 8));

	}

}
