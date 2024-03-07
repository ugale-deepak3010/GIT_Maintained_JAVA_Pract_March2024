import static org.junit.Assert.*;

import org.junit.Test;

import ArithmaticPackage.MathClass;

public class minusUnitTesting {

	@Test
	public void test() {
		MathClass m= new MathClass();
		int o = m.minus(2, 4);
		System.out.println(o);
		
		
		assertEquals(-2, o);
	}

}
