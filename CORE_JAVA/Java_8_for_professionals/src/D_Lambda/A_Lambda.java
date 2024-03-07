package D_Lambda;


/**
 * <pre> 
 * lambda for functional interface is required.
 * </pre>
 * 
 */
public class A_Lambda {

	public static void main(String[] args) {
		
		B_Calcu add= (a,b)->a+b;
		B_Calcu sub= (int a, int b)->a-b;
		B_Calcu mul= (a,b)->{
			return a*b;
			};
		B_Calcu div= (a,b)->a/b;
		
		System.out.println(add.operation(8, 2));
		System.out.println(sub.operation(8, 2));
		System.out.println(mul.operation(8, 2));
		System.out.println(div.operation(8, 2));

	}

}
