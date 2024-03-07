package C_Interfaces;

/**
 * 
 * <pre>
 *  Allow for non-static method on an interface to have a body.
 *  Default method can be overridden.
 *  If we implement multiple interface but there is same name default method?
 *  then we need to implement override method in class!
 * 
 * 	Default:
 *  
 *  Default methods in interface.
 *  Default in switch statement.
 *  Default access modifier (just the name, not actual keyword like private, public, protected)
 * 	Default to give annotation a default value.
 * 
 * </pre>
 */

public class C_DefaultMethod implements Bye {
	
	// try to comment below method
	@Override
	public void byeBye() {
		System.out.println("Bye Bye Bye Bye Bye Bye!!!");
	}

	public static void main(String[] args) {
		C_DefaultMethod obj= new C_DefaultMethod();
		
		obj.byeBye();// try to comment overridden method
		
	
		
	}

	

}
