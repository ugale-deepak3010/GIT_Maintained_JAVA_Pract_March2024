package C_Interfaces;

/**
 * <pre>
 *  
 * 
 * Functional interface can only one abstract method.
 * 
 * it's have must @functionalInterface annotation 
 * 
 * it can contain default & static method because that are not abstract.
 * 
 * it's used for lambda function.
 * must have functional programming
 * 
 * </pre>
 * 
 */
public class D_Functional_Interface implements E_HelloFunctionaInterface {

	@Override
	public void hello() {
		System.out.println("HELLLO");
	}

	public static void main(String[] args) {
		System.out.println("-");

		E_HelloFunctionaInterface e = () -> System.out.println("HELLLOW");

		e.hello();

		D_Functional_Interface d = new D_Functional_Interface();
		d.hello();
		
		
	}

}
