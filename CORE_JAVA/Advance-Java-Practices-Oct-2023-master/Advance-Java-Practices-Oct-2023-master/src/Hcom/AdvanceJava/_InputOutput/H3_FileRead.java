package Hcom.AdvanceJava._InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// bufferreader can be use with synchrounous

// all resou
public class H3_FileRead {

	public static void main(String[] args) {
		File myTxtFile= new File("C:\\Users\\Dipak.Ugale\\Documents\\GitHub Project\\Oct-20-2023 Java Projects\\Advance Java Linkedin Course\\Practices_1\\src\\Hcom\\AdvanceJava\\_InputOutput\\H3_SampleParagraph.txt");
		
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(myTxtFile));
			String lineString;
			
			while ((lineString = bufferedReader.readLine())!= null) {
				System.out.println(lineString);
			}

		} catch (Exception e) {
			System.out.println("Failed to open :"+e.toString());
		}
	}

}
