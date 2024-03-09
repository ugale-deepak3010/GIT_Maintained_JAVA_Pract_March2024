package com.AdvanceJava;

import java.util.ArrayList;
import java.util.List;

public class C4_Liskov_Subtitution_Principle {

	public static void main(String[] args) {
		//	if you have variable at given type,
		//	you can assign a value that is subtype of Type
		
		Building building= new Building();
		Office office=new Office();
		
		build(building);
		build(office);
		
		List<Building> build=new ArrayList<>();
		build.add(building);
		build.add(office);		// Office is sub type of Building.---------><--
		printBuild(build);

		List<Office> offices =new ArrayList<>();
		//offices.add(building);		// Error	// Office is sub type of Building.---------><--
		offices.add(office);
		
		
		//printBuild(offices); 			// can't apply. check c5 session.
	}

	private static void build(Building building) {
		System.out.println("Constructing a = " + building.toString());
	}
	
	private static void printBuild( List<Building> building) {
		for (Building building2 : building) {
			System.out.println(building2);
		}
	}
	

}

class Building{
	public String toString() {
		return "Building";
	}
}

class Office extends Building {
	@Override
	public String toString() {
		return "Office";
	}
}
