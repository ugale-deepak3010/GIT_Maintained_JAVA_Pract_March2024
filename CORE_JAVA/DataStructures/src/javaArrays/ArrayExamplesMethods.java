package javaArrays;

public class ArrayExamplesMethods {

	public String[] ArrayToUpperCase(String[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i].toUpperCase();
		}
		return array;
	}

	public int[] incrementBy1(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i]+1;
			
		}
		
		return array;
	}
}
