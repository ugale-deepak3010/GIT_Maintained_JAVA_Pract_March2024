package com.javaAlgorithmPractices.tArraysAlgo;

import java.util.Arrays;

public class D_ReverseArray {

	public static int[] reverseIntArr(int[] arr) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			result[arr.length - i - 1] = arr[i];
		}
		return result;
	}

	public static int[] reverseIntArr2(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int temp = arr[arr.length - 1];
			arr[arr.length - 1] = arr[i];
			arr[i] = temp;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(array));

		System.out.println(Arrays.toString(reverseIntArr(array)));
		System.out.println(Arrays.toString(reverseIntArr2(array)));
	}

}
