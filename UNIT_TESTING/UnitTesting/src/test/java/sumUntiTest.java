import static org.junit.Assert.*;

import org.junit.Test;

import ArithmaticPackage.MathClass;

public class sumUntiTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		
		MathClass m= new MathClass();
		int o = m.sum(2, 4);
		System.out.println(o);
		
		
		assertEquals(6, o);
		
	}

}
