package javaArrays;

import java.util.Arrays;

public class ArraysExample extends ArrayExamplesMethods {

	

	public static void main(String[] args) {

		String[] weekDays = new String[7];
		System.out.println(Arrays.toString(weekDays));

		weekDays[0] = "Someday";
		System.out.println(Arrays.toString(weekDays));

		weekDays = new String[] { "Mon", "Tue" }; // creating new Array and Assigning in weekDays.
		System.out.println(Arrays.toString(weekDays));
		
		
		ArrayExamplesMethods arraysExample = new ArrayExamplesMethods();

		String temp[] = arraysExample.ArrayToUpperCase(weekDays);
		System.out.println(Arrays.toString(temp));
		
		int[] numArray = {2,5,7,9,3,45,0,3};
		int[] numIncArr =  arraysExample.incrementBy1(numArray);
		System.out.println(Arrays.toString(numIncArr));
		

	}

}
