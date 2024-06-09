package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class PlayWithFiles {

	public static void main(String[] args) throws IOException {
		System.out.println("--");
		
		
		//---	FILE CREATION
		String fileParentPath="C:\\Users\\Dipak.Ugale\\Apps\\deepakworkspace\\eclipseworkspace\\eclipse29122023workspace\\deepworkspace\\JavaCommonPractices\\TestLocation";
		String fileName="test.txt";
		
		File myTestFile= new File(fileParentPath, fileName);
		myTestFile.createNewFile();
		
		System.out.println("File is created!");
		
		//----	FILE WRITING
		FileWriter fileWriter= new FileWriter(myTestFile);
		fileWriter.write("Hello Deepak!\n I am second Line!\n I am Third Line.");
		fileWriter.close();
		
		
		//---	FILE READING (only metadata)
		FileReader fileReader= new FileReader(myTestFile);

		String FileEncode=  fileReader.getEncoding();// UTF-8
		System.out.println("Encoding= "+FileEncode);
		
		//----	FILE READING (inside content)
		BufferedReader bufferedReader= new BufferedReader(fileReader);
		String content= bufferedReader.readLine();
		System.out.println("Content= "+content);
		
		Stream<String> fileLinesStream= bufferedReader.lines();//remaining lines by position.
		fileLinesStream.forEach(line->System.err.println(line));
		
		fileReader.close();
		
		myTestFile.delete();
	
		
	}

}
