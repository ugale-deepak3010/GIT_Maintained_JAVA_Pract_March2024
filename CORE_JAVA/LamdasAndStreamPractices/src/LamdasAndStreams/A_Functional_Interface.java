package LamdasAndStreams;

//functional interface is allow only one method in scope for self overriding.
@FunctionalInterface
interface Greetings {
	public void hello();
}

public class A_Functional_Interface implements Greetings {

	@Override
	public void hello() {
		System.out.println("Hello Deepak");
	}

	public static void main(String[] args) {
		System.out.println("-------");

		Greetings g = new A_Functional_Interface();
		g.hello();

		Greetings g2 = new Greetings() {

			@Override
			public void hello() {
				System.out.println("Hello Dipak");

			}
		};

		g2.hello();

	}

}
