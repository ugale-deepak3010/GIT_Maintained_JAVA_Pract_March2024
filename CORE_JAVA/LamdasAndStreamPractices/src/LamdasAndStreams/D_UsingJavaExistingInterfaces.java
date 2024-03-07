package LamdasAndStreams;

import java.util.function.IntBinaryOperator;


/**
 * List of existing functions:<br>
 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 */
public class D_UsingJavaExistingInterfaces {

	public static void main(String[] args) {

		IntBinaryOperator calc= (int a, int b)->{
			System.out.println("a="+a+" b="+b);
			return a+b;
		};
		
		int r= calc.applyAsInt(2, 3);
		System.out.println(r);
	}

}
