package com.javaAlgorithmPractices.tArraysAlgo;

import java.util.Arrays;

/**
 * Binary search for array must be sorted!!!<br>
 * Binary search is dividing in half, then half of half, then half of half..<br>
 * while dividing checking this element is same for search?<br>
 * 
 * 
 */
public class BinarySearch {

	public static int binarySearchinArr(int[] array, int item) {

		int min = 0;
		int max = array.length - 1;
		
		while (min <= max) {
			int mid = (min + max) / 2;			
			if (array[mid] == item) {
				return mid;
			} else if (item < array[mid]  ) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		System.out.println(binarySearchinArr(array,3));
		System.out.println(binarySearchinArr(array,300));
		
		System.out.println(Arrays.binarySearch(array, 3));
		System.out.println(Arrays.binarySearch(array, 300));

	}

}
