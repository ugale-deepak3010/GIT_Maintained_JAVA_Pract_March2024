package Others;

import Others.Outer.Inner;


class Parent{
	int c=30;
}

class Outer extends Parent{
	int a=10;
	
 	class Inner{
		int b=20;
	}
}

public class Main  {

	public static void main(String[] args) {
		

		System.out.println("------");
		
		Outer outer= new Outer();
		
		Inner inner= outer.new Inner();
		
		
		System.out.println(outer.a);
		System.out.println(inner.b);
		
		
		Parent parent= new Outer();
		System.out.println(parent.c);
		
	}

}
