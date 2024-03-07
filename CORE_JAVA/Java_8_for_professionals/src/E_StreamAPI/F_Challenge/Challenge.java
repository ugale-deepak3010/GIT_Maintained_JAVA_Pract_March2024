package E_StreamAPI.F_Challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {

	public static void main(String[] args) {
		
		String[] names= {"Rylee","Thomas","Angelieque","Deepak","Netale","Maaike",
				"Ella","Anya","Satish","antony","Jerry","Fatima"};
		
		//	CHALLENGE 1 - create list start with A or a.
		
		List AnamesList = Arrays.stream(names)
				.filter(name->name.startsWith("A")||name.startsWith("a"))
				.collect(Collectors.toList());
		System.out.println("start with A: "+AnamesList);
		
		// 	Challenge 2 - if Maaike then concatenate with Student and print.
		
		Arrays.stream(names)
						//.map((name)->{if (name!="Maaike")name=name +" Student";return name;})
						.map(name->name.equals("Maaike")?name:name.concat(" Student"))
						.forEach(name->System.out.println(name));
		
		//	Challenge 3 - remove Fatima from list.
		
		Arrays.stream(names)
		.filter(name->!name.equals("Fatima"))
				.forEach(name->System.out.println("Without Fatima: "+name));
		
		List exceptOne=Arrays.stream(names)
									.filter(name->!name.equals("Fatima"))
									.peek(name->System.out.println(name))
									.collect(Collectors.toList());
		

	}

}
