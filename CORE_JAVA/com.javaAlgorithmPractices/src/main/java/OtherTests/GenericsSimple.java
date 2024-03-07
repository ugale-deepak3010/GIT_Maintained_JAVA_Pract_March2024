package OtherTests;

/**
 * We can use anything istead of 'T' 
 * <br> exameple: 'm', 'myCustomDataType'
 * @param <T>
 */
class Hello<T>{
	public T greet;
	
	public Hello(T t) {
		this.greet=t;
		
	}
	
	
}

public class GenericsSimple {

	public static void main(String[] args) {
		
		Hello<String> h=new Hello("Deepak");
		
		System.out.println("Hello "+h.greet);
		
		Hello<Integer> age=new Hello(26);
		
		System.out.println("Age is:  "+age.greet);
		

	}
}

