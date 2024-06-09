package Icom.AdvanceJava._FilesAndDirectories;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class I3_PathsClass {

	public static void main(String[] args) {
		
		try {
			File nFiles = new File("My New File.txt");
			nFiles.createNewFile();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		try {
			Path path= Paths.get("My New File.txt");
			Files.deleteIfExists(path);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
