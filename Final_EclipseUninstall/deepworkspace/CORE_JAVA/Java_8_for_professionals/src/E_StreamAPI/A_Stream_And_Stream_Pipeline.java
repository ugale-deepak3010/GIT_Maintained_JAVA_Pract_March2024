package E_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * 
 * 
 * 
 * 	Work with only sequence of elements or Collections.
 *  Modify or remove using loop and new array or collection.
 * 
 * functional programming
 * operations on elements.
 * sequential or parallel.
 * stream pipelines.
 * 
 * </pre>
 */
public class A_Stream_And_Stream_Pipeline {

	public static void main(String[] args) {

		String[] names = { "Deepak", "Manali", "Akanksha", "Anjali", "Ankita", "Pooja" };

		List<String> Anames = new ArrayList<String>();

		for (String name : names) {
			if (name.startsWith("A")) {
				Anames.add(name);
			}
		}

		System.out.println(Anames);

		List<String> newAnameList = new ArrayList<String>(Arrays.asList(names));

		try {
			for (String name : newAnameList) {
				if (name.equals("Anjali")) {
					newAnameList.remove(name);
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}

		System.out.println(newAnameList);

	}

}
