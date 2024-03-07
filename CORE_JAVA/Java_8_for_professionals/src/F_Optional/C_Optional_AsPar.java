package F_Optional;

/**
 * <pre>
 * Usage
 * 
 * 0. Resolving null pointer exception.
 * 1. Querying the data layer with SQL.
 * 2. May result or may not be null. 
 * 3. No constant null check on the returned value.
 * 4. No NPEs due to forgetting to check for null. 
 * 
 * x. Can't use as a parameter type or data type!
 *    it's only for return data type.
 * </pre>
 */
public class C_Optional_AsPar {

	static String onlyEven(String startWithD) {
		 if(startWithD.startsWith("D")) {
			 return startWithD;
		 }
		 else {
			return null; 
		 }
	}
	
//	static int strLen(String name) {
//		return name.length();
//	}

	public static void main(String[] args) {

		String DName= onlyEven("xDeepak");

		System.out.println("--");
		if (DName==null) {
			System.out.println("it's null");
			//strLen(DName);
			
			throw new NullPointerException("I can't process with null value");
		}else {
			System.out.println("it's not null");
		}

	}

}
