package com.AdvanceJava;

public class C3_VarArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		disp(2,3);
		
	}

	private static void disp(int... num) {
		
		for (int i : num) {
			System.out.println(i);
		}
	}

}
