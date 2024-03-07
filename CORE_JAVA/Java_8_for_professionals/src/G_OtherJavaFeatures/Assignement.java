package G_OtherJavaFeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

// Write your answer here, and then test your code.
// Your job is to implement the findAnswer() method.

public class Assignement {

	// Return the highest grade for the students with a specific major
	static int findAnswer(List<students> studentsList, String major) {
		// Your code goes here.
		
		

		Stream<students> studStream = studentsList.stream();

		Optional<Integer> maxGrade =  
				studStream
				.filter(stud->stud.getMajor().equals(major))
				.flatMap(cls->cls.getGrades().values().stream())
				//.forEach(n->System.out.println(n));
				.max((a,b)->Integer.compare(a, b));
			
		
		//Optional<Integer> maxGrade = studStream.map((studs) -> studs.getGrades().get(major))
		//		.max((a, b) -> Integer.max(a, b));

		
		return maxGrade.orElse(0);
	}

	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Data Structures", 75);
		myMap.put("Calculus", 67);
		
		
		Map<String, Integer> myMap2 = new HashMap<String, Integer>();
		myMap2.put("Data Structures", 77);
		myMap2.put("Calculus", 88);
		myMap2.put("Computer Science", 99);
		
		Map<String, Integer> myMap3 = new HashMap<String, Integer>();
		myMap3.put("Data Structures", 87);
		myMap3.put("Calculus", 65);
		myMap.put("Computer Science", 95);


		students s2= new students("Deepak", "Ugale", "Computer Science1",myMap2);
		students s1= new students("Amine", "Ousmane", "Calculus",myMap);
		students s3= new students("Manali", "Rahangdhale", "Computer Science",myMap);
		
		List<students> studentss = new ArrayList<students>();
		studentss.add(s1);
		studentss.add(s2);
		studentss.add(s3);
		
		
		
		
		String major = "Computer Science";
		int finalRes = findAnswer(studentss, major);

		System.out.println(finalRes);
	}

}

/*
 * 
 * new students("Lily-Ann", "Smith", "Mathematics",
						Map.of("Algorithms", 80, "Data Structures", 75, "Calculus", 88)),
				new students("Li", "Wei", "Computer Science",
						Map.of("Algorithms", 92, "Data Structures", 89, "Calculus", 88)),
				new students("Jessica", "Rodriguez", "Mathematics",
						Map.of("Algorithms", 85, "Data Structures", 80, "Calculus", 89))
						*/
