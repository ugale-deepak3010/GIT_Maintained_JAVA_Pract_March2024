package Ecom.AdvanceJava._Programming;


/*

Define @FunctionalInterface with single abstract method.
abstract method have one class.
that class in refer method.

 */
public class D3_MethodReferences {

	public static void main(String[] args) {
		
		Square s=new Square(4);
			
		Shapes shapes= (Square sq) ->{
			return sq.calculateSideArea();
		};
		System.out.println("Using Lamda = Area is: "+ shapes.getArea(s));
		
		Square s1=new Square(5);
		Shapes shapes2 = Square::calculateSideArea;
		System.out.println("Using method Reference = Area is:: "+ shapes2.getArea(s1));
	}

}

class Square{
	int sideLength;

	public Square(int sideLength) {
		this.sideLength = sideLength;
	}
	
	public int calculateSideArea() {
		return sideLength*sideLength;
	}
}