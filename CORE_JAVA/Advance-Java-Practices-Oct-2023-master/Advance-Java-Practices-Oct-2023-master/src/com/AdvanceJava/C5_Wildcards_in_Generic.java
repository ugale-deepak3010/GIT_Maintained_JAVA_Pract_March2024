package com.AdvanceJava;

/*

Basically it's allow to validation in Collection.
List<? extends Building> myClass
 */


import java.util.ArrayList;
import java.util.List;

public class C5_Wildcards_in_Generic {

	public static void main(String[] args) {
		//	bad idea to use wildcards in return type.
		
		Building buildingS= new Building();
		Office officeS=new Office();
		
		List<Building> build=new ArrayList<>();
		build.add(buildingS);
		build.add(officeS);		
		printBuild(build);

		List<Office> offices =new ArrayList<>();
		//offices.add(buildingS);		// Error	
		offices.add(officeS);
		System.out.println("------");
		printBuild(offices); // 		------ focus on this method.

		HouseS houseS=new HouseS();
		List<HouseS> housList =new ArrayList<>();
		//offices.add(buildingS);		// Error	
		//housList.add(officeS);		// Error
		housList.add(houseS);		
		System.out.println("------");
		printBuild(housList); // 		------ focus on this method.
		
		addHouseToList(housList);
		addHouseToList(build);	//	Error. used super so no error coming
		
	}

	
	
	private static void addHouseToList(List<? super HouseS> building) {
		building.add(new HouseS());
		System.out.println();
	}



	private static void printBuild( List<? extends Building> building) {
		for (Building building2 : building) {
			System.out.println(building2);
		}
	}
	

}

class BuildingS{
	public String toString() {
		return "BuildingS";
	}
}

class OfficeS extends Building {
	@Override
	public String toString() {
		return "OfficS";
	}
}
class HouseS extends Building {
	@Override
	public String toString() {
		return "HouseS";
	}
}
