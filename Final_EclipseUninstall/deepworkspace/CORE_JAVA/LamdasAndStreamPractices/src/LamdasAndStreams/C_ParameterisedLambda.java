package LamdasAndStreams;

import java.util.Random;

@FunctionalInterface
interface Calcy{
	void disp(int a, int b);
}

public class C_ParameterisedLambda {

	
	
	public static void main(String[] args) {
		Calcy c= (int a, int b)->{
			System.out.println("Number a "+a+" number b = "+b);
			
			Random random = new Random();
			int randomInt = random.nextInt(101);
			System.out.println("Random Int = "+randomInt);
		};
		
		c.disp(45, 46);
	} 

}
