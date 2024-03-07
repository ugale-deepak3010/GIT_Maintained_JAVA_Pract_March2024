package IMP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * 
 * 
 *
 * Consider the  class representing a student's 
name, grade (marks out of 100) in different subjects:

Now, assume you have a list of `StudentGrade` objects, 

each containing a student's name and their grades in various subjects.

Your task is to find the average grade for each subject across all students
 and identify the subject with the highest average grade.
 
 * 
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome");
		
		Map<String, Integer> val = new HashMap<>();
	    val.put("Math", 90);
	    val.put("Physics", 85);
	    val.put("History", 78);
	    
	    Map<String, Integer> val2 = new HashMap<>();
	    val2.put("Math", 92);
	    val2.put("Physics", 88);
	    val2.put("History", 75);
	    
	    Map<String, Integer> val3 = new HashMap<>();
	    val3.put("Math", 85);
	    val3.put("Physics", 95);
	    val3.put("History", 80);
	    
	    Map<String, Integer> val4 = new HashMap<>();
	    val3.put("Math", 8);
	    val3.put("Physics", 9);
	    val3.put("History", 8);
	    
	    
	    
		
		StudentsGrade valObj = new StudentsGrade("Deepak", val);
		StudentsGrade val2Obj = new StudentsGrade("Ram", val);
		StudentsGrade val3Obj = new StudentsGrade("Sham", val);
		
		
		List<StudentsGrade> studentGrades = new ArrayList<>();
		
		studentGrades.add(valObj);
		studentGrades.add(val2Obj);
		studentGrades.add(val3Obj);
		
		
		
		//Stream<StudentsGrade> highestAvgGrade = studentGrades.stream()
		
		TreeSet<Integer> grades = new TreeSet<Integer>();
		
		
		
	}

}

