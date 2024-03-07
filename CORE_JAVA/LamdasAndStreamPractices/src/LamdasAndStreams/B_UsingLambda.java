package LamdasAndStreams;

//functional interface is allow only one method in scope for self overriding.
@FunctionalInterface
interface Greeting {
	public void hello();
}

public class B_UsingLambda implements Greeting {

	@Override
	public void hello() {
		System.out.println("Hello Deepak");
	}

	public static void main(String[] args) {
		System.out.println("-------");
		Greeting g = new B_UsingLambda();
		g.hello();

		System.out.println("-------");
		Greeting g2 = new Greeting() {

			@Override
			public void hello() {
				System.out.println("Hello Dipak");

			}
		};
		g2.hello();

		System.out.println("-------");
		Greeting g3 = () -> System.out.println("Hello Deepak!!!"); // Lambda function
		g3.hello();
		
		System.out.println("-------");
		Greeting g4 = () ->{ System.out.println("Hello Deeepak!!!");}; // Lambda function
		g4.hello();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
