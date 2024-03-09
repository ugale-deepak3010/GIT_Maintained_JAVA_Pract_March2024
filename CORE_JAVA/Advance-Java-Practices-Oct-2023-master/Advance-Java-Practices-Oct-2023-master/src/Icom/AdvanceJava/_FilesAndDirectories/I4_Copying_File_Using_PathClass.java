package Icom.AdvanceJava._FilesAndDirectories;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class I4_Copying_File_Using_PathClass {

	public static void main(String[] args) {
		
		try {
			Path sourceA= Paths.get("A.txt");
			Path sourceB= Paths.get("B.txt");
			
			Files.copy(sourceA, sourceB);
			System.out.println("Copied!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
