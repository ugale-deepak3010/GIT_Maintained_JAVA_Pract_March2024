package com.AdvanceJava;

import java.util.ArrayList;
import java.util.List;

public class C1_ArrAndGenericExample {
	
	public static void main(String args[]) {
		System.out.println("Hello Deepak Ugale!");
		
		//----------------		Array way 1. [directly value initialize]
		String[] day = {"Monday","Tue"};
		
		day[0]="Sunday";			// just updating value!
		System.out.println(day[0]);
		//day[2] = "Tue";		//can't add because "size is not initialized".
		
		//------------- 		Array way 2 [USing size set]
		String[] Animal = new String[1];  		// length Start from 1 not 0
		Animal[0]="Dog";	// only array length start from 0
		//Animal[1]="Cat";	// length is only one
		
		String[] animals;
		animals = new String[1]; animals[0]="Dog";
		
		String animal_s[];
		animal_s = new String[1]; animal_s[0]="Dog";
		
		
		//------------		Generic ArrayList  way 1 [using object]
		List daysList = new ArrayList();
		daysList.add("Sunday");
		daysList.add(2);		// data type is not specify so it will allow.
		
		String day1= (String) daysList.get(0);
		System.out.println();
		//day1.add(2);		// only specify data type allow!
		
		//------------ 			Data "type" declaration.
		List<String> day2= new ArrayList<String>();
		day2.add("Sunday");
		
		String myDayString= day2.get(0);
		
		
 	}

}
