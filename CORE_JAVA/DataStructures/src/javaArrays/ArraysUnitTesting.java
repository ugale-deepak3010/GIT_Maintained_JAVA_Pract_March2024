package javaArrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysUnitTesting {

	ArrayExamplesMethods a = new ArrayExamplesMethods();

	@Test
	public void testArrayToUppercase() {

		String[] s = { "Cs", "Msc", "bs", "JavA" };
		String[] x = a.ArrayToUpperCase(s);

		assertArrayEquals(new String[] { "CS", "MSC", "BS", "JAVA" }, x);

		System.out.println(Arrays.toString(x));
	}
	
	@Test
	public void testNumToIncreseBy1() {
		
		int[] intNum = new int[5];
		intNum = new int[] {2,3,1,3,4,5};
		
		int[] resNum = a.incrementBy1(intNum);
		
		assertArrayEquals(new int[] {3,4,2,4,5,6}, resNum);
		System.out.println(Arrays.toString(resNum));
		
	}

}
