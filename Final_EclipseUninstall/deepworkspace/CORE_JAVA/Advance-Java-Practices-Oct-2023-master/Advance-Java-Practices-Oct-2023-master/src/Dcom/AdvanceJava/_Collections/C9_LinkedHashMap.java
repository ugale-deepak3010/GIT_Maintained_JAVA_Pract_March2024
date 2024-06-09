package Dcom.AdvanceJava._Collections;

import java.util.LinkedHashMap;

// it maintain the order only. Advance version of Hash map.

public class C9_LinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> phonebook= new LinkedHashMap<>();	// it will support multiple par for Constructor
		phonebook.put("Manali", 9900);
		phonebook.put("Deepak", 8975);
		
		phonebook.put("Manali", 996666);
		
		System.out.println(phonebook);
	}


}
