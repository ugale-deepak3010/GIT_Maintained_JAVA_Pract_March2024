package Icom.AdvanceJava._FilesAndDirectories;

import java.io.File;
import java.io.FilenameFilter;

public class I2_Directory {

	public static void main(String[] args) {

		String[] dirItem = new File(".").list();	// . means current directory.
		for (String item : dirItem) {
			System.out.println(item);
		}
		
		new File("MyNewDirectory").mkdir();
		
		System.out.println("----------");
		
		FilenameFilter filter = ((file, fileName)->{
			return fileName.contains(".");
		});
		
		String[] dirItemWhereDot = new File(".").list(filter);
		for (String item : dirItemWhereDot) {
			System.out.println(item);
		}
	}

}
