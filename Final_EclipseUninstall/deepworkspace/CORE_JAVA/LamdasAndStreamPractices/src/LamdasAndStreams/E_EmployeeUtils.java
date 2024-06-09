package LamdasAndStreams;

import java.util.function.Function;
import java.util.function.Predicate;

public class E_EmployeeUtils {

	public String getFullName(E_Employee employee) {

		Function<E_Employee, String> fullName = (E_Employee e) -> e.getFistName() + " " + e.getLastName();

		return fullName.apply(employee);
	}

	public String getManagerLastName(E_Employee employee) {

		Function<E_Employee, String> managerLastName =

				(E_Employee e) -> e.getManager().getLastName();

		String mnm = managerLastName.apply(employee);
		return mnm;
	}

	public boolean hasBeenEmployedLastThanFiveYears(E_Employee employee) {

		Predicate<E_Employee> emplyeeLongerThanFiveYears = (E_Employee e) -> e.getYearsOfService() > 5;

		return emplyeeLongerThanFiveYears.test(employee);
	}
	
	

}
