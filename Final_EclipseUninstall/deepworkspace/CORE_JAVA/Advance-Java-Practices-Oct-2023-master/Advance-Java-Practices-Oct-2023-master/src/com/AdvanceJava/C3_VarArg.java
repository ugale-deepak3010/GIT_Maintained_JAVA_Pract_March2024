package com.AdvanceJava;

public class C3_VarArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
		disp(2,3);
		
//		int a[] = {7,9};
//		disp(a);
		
	}

	private static void disp(int... num) {
		
		for (int i : num) {
			System.out.println(i);
		}
	}

}
