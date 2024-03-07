package IMP;

import java.util.Arrays;
import java.util.Iterator;

public class ArrMove {

	public static int[] shiftArrPos(int[] arr, int k) {
		
		int[] arr1 = new int[arr.length-k];
		int[] arr2 = new int[k];
		
		for (int i = 0; i < arr.length-k; i++) {
			arr1[i] = arr[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[(arr.length-k)+i]; // 7,- 3= 4+i
			
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[] output = new int[arr.length];
		
		for (int i = 0; i < arr2.length; i++) {
			output[i] = arr2[i];
			
		}
		
		System.out.println(Arrays.toString(output));
		
		
		int startPos = k;	// 7 - 3 = 4
		int endPos = arr.length-1;
		
		for (int i = 0; i < arr1.length; i++) {
			int v=  arr1[i];
			output[startPos+i] = v;	//7		
			
			System.out.println(startPos+i);
		}
		;
		System.out.print("Output = ");
		System.out.println(Arrays.toString(output));
		
		return output;
	}
	
	public static void main(String[] args) {
		
		System.out.println("--------");

		int[] input = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(input));
		shiftArrPos(input, 6);
		
	}

}
