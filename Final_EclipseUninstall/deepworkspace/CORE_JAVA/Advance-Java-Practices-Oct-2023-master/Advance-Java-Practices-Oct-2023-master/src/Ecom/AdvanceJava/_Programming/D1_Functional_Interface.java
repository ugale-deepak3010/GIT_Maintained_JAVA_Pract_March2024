package Ecom.AdvanceJava._Programming;

/*

it's an annotation.

Lambda method is implements functional interface.

Functional Interface it has only one Abstract method.
 

 */

public class D1_Functional_Interface {

	public static void main(String[] args) {
		GreetingMessage gMessage = new GreetingMessage() {

			@Override
			public void greet(String name) {
				System.out.println("Welcome " + name);
			}
		};

		gMessage.greet("Deepak Ugale");

		// Lambda function.
		GreetingMessage object = (String name) -> {
			System.out.println("Hii");
			System.out.println("Hii");
		};
		
		

	}

}
