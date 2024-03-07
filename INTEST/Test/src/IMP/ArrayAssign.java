package IMP;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayAssign {

	public static int[] ratateNum(int[] arr, int k) {

		int[] arr1 = new int[arr.length - k];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}

		int[] arr2 = new int[k];

		// System.err.println(arr.length - (k+1));

		for (int i = 0; i < arr2.length ; i++) {

			arr2[i] = arr[(arr.length + i) - (k)]; // (7 -0) - (3) = 4, 3, 2
			System.out.println();
		}
	
		int[] output = new int[arr.length];
		
		
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i];
		}
		
		for (int i = arr1.length; i < arr.length; i++) {
			output[i] = arr2[i - arr1.length];
			//System.out.println(i - arr1.length);
		}
		
		
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7 };

		
		System.out.println(Arrays.toString(ratateNum(input, 3)));
	}

}

/*
 *
 *
 * Input: [1, 2, 3, 4, 5, 6, 7], k = 3 Output: [5, 6, 7, 1, 2, 3, 4]
 * 
 * 
 * Input: [1, 2, 3, 4, 5, 6, 7], k = 2
 * 
 * Output: [6,7,1,2,3,4,5]
 * 
 * 
 */
