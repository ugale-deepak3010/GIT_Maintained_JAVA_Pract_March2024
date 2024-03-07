package C_Interfaces;

@FunctionalInterface
public interface E_HelloFunctionaInterface {

	public abstract void hello();
	
	//void anotherInvalidMethod();
	
	String toString();
	// Object class is parent class for all classes. so it's just overriding
	// hence it's allowed!
	
	static void hii() {
		System.out.println("hii");
	}
	
	default void hey() {
		System.out.println("hey");
	}
}
