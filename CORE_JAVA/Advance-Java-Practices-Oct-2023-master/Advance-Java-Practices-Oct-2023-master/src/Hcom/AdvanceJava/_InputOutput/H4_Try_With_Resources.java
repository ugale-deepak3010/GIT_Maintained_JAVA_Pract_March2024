package Hcom.AdvanceJava._InputOutput;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;

/*
 
 All resources must be close!
 it will say code linkage.
 
 if working with multiple resources and that communicate 
 with each other then it will very hard problem to handle
 
 */

public class H4_Try_With_Resources {

	public static void main(String[] args) {

		try { BufferedReader bReader= new BufferedReader(new StringReader("Hello Deepak Ugale"));
			StringWriter stringWriter= new StringWriter();
			
			stringWriter.write(bReader.readLine());
			System.out.println(stringWriter.toString());
		} catch (Exception e) {
			System.out.println("Error = "+e.toString());
		}
		//--------------- Below code is Try with Resources -----------------------------
		
		try(
				BufferedReader bReader= new BufferedReader(new StringReader("Hiiii Deepak Ugale"));
				StringWriter stringWriter= new StringWriter();
			) {

			stringWriter.write(bReader.readLine());
			System.out.println(stringWriter.toString());
			
		} catch (Exception e) {
			System.out.println("Error = "+e.toString());
		}

	}

}
