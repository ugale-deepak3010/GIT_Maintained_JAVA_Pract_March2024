package Dcom.AdvanceJava._Collections;

import java.util.HashMap;

/*
Unordered
Distinct 

Key:Values

example: phoneBook

 */
public class C8_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> phonebook= new HashMap<>();
		phonebook.put("Deepak", 8975);
		phonebook.put("Manali", 9900);
		phonebook.put("Manali", 996666);
		
		System.out.println(phonebook);
	}

}
