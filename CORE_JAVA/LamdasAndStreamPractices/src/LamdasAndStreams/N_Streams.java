package LamdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Why required stream to use?
 * 
 * example: List of countries Capitalize everything, Filter out countries begin
 * with "C", Sort countries in alphabetical order, print result to console.
 * 
 * 
 * 
 */

public class N_Streams {

	public static void main(String[] args) {

		String[] countries = new String[6];
		countries = new String[] { "Canada", "Cania", "India", "California", "China", "England" };

		// System.out.println(Arrays.toString(countries).toUpperCase());

		List<String> countriesList = new ArrayList<String>();
		
		countriesList = Arrays.asList(countries);
		// System.out.println(countriesList);
		List<String> cList = countriesList;
				
		Collections.sort(countriesList);
		for (String country : countriesList) {
			country.toUpperCase();
			if (!country.startsWith("C")) {
				System.out.println(country);
			}
		}
		
		System.err.println("------------");
		
		cList.stream()
		//.map(s -> s.toUpperCase())
		//.filter(s -> s.startsWith("c"))
		//.sorted()
		.forEach(s->System.out.println(s));

	}

}
