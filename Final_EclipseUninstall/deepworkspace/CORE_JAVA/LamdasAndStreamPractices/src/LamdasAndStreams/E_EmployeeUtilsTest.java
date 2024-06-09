package LamdasAndStreams;

import static org.junit.Assert.*;

import org.junit.Test;

public class E_EmployeeUtilsTest {

	private E_EmployeeUtils employeeUtils = new E_EmployeeUtils();

	@Test
	public void testEmployeeFullName() {
		E_Employee e = new E_Employee();
		e.setFistName("Deepak");
		e.setLastName("Ugale");

		String actual = employeeUtils.getFullName(e);

		String expected = "Deepak Ugale";

		assertTrue(actual.equals(expected));

//		if (actual == expected) {
//			System.out.println("Yes matching");
//		}
//		else {
//			System.err.println(" == not work for String");
//			
//			if (actual.equals(expected)) {
//				System.out.println(" only string.equal(o) is work for string ");
//			}
//		}

	}

	@Test
	public void testGetEmployeeIsLongerThenFiveYears() {
		E_Employee e = new E_Employee();
		e.setYearsOfService(20);

		boolean moreThan5years = employeeUtils.hasBeenEmployedLastThanFiveYears(e);
		assertTrue(moreThan5years);
	}

	@Test
	public void testGetManagerLastName() {

		E_Employee e = new E_Employee();
		e.setFistName("Deepak");

		E_Employee manager = new E_Employee();
		manager.setLastName("SPatil");

		e.setManager(manager);

		String mngLn = employeeUtils.getManagerLastName(e);

		String expected = "SPatil";

		assertTrue(mngLn.equals(expected));

	}

}
