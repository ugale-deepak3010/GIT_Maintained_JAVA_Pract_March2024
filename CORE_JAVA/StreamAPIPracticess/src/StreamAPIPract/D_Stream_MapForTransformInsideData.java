package StreamAPIPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class D_Stream_MapForTransformInsideData {

	public static void main(String[] args) {
		
		List<String> nameList= new ArrayList<String>();
		nameList = Arrays.asList("Deepak","AkanKSHA", "MAnaLI", "PRajKTA", "ANkiTa");
		
		Stream<String> nameStream = nameList.stream();
		
		nameStream
		.map(name->name.toUpperCase())
		.forEach(name->System.out.println(name));

	}

}
