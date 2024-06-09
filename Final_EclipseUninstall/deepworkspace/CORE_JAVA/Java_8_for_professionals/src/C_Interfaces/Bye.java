package C_Interfaces;


public interface Bye {
	
	//abstract public String ByeGn();
	
	public static void Byeee() {
		System.out.println("Byeee!");
	}
	
	//in interface definition is not allowed but in default it can
	default void byeBye() {
		System.out.println("Bye Bye !!");
	}
	
	default void byeBye2() {
		System.out.println("Bye2 Bye2 !!");
	}
	

}
