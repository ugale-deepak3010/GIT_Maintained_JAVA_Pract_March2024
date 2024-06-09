package com.HelloWorld;

import java.util.ArrayList;

public class AnnotationPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Test t= new Test();
		t.ListDemo();
	}

}

class Test{
	//@SuppressWarnings("unchecked")
	void ListDemo(){
		
		ArrayList<String> day = new ArrayList<String>();
		
		day.add("Moday");
		day.add("Tue");
		System.out.println("Done");
		System.out.println(day.get(1));
		
	}
}
