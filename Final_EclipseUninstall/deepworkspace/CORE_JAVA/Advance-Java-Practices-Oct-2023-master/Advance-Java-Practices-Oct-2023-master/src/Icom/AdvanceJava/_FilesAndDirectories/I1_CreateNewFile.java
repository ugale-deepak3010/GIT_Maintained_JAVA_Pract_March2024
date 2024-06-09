package Icom.AdvanceJava._FilesAndDirectories;

import java.io.File;

public class I1_CreateNewFile {

	public static void main(String[] args) {
		File myFile = new File("SampleFile.txt");
		try {
			boolean NewFileCreated = myFile.createNewFile();
			
			System.out.println(NewFileCreated);
		} catch (Exception e) {
			
		}

	}

}
