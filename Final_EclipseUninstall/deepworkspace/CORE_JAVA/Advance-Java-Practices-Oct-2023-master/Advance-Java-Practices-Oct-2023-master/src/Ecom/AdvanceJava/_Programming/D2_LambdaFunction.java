package Ecom.AdvanceJava._Programming;

public class D2_LambdaFunction {

	public static void main(String[] args) {
		
		GreetingMessage gm2= (String name) -> {
			System.out.println("Welcome "+name+" in Lambda Function");
		};
		
		gm2.greet("Deepak");
		
		GreetingMessage gm3=(String com) -> {
			System.out.println("Welcome at "+com);
		};
		
		
		
	}

}
