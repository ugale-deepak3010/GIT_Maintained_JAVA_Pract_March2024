package StreamAPIPract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class C_Stream_FindEmpSalaryGreaterThan {

	public static void main(String[] args) {
		
		Map<String, Integer> SalaryMap = new HashMap<String, Integer>();
		
		SalaryMap.put("Deepak", 50000);
		SalaryMap.put("RAM", 10000);
		SalaryMap.put("AKANKSHA", 200000);
		SalaryMap.put("MANALI", 200000);
		
		Stream<Entry<String, Integer>> streamMap =  SalaryMap.entrySet().stream();
		
		
		
		C1_Stream_FindEmpSalaryGreaterThan_Employee employee= new C1_Stream_FindEmpSalaryGreaterThan_Employee();
		employee.setName("Deepak");
		employee.setSalary(100000);
		
		C1_Stream_FindEmpSalaryGreaterThan_Employee employee2= new C1_Stream_FindEmpSalaryGreaterThan_Employee();
		employee2.setName("Manali");
		employee2.setSalary(500000);
		
		List<C1_Stream_FindEmpSalaryGreaterThan_Employee> empList = new ArrayList<C1_Stream_FindEmpSalaryGreaterThan_Employee>();
		empList.add(employee);
		empList.add(employee2);
		
		empList.stream()
		.filter(emp->emp.getSalary()>10000)
		.forEach(emp->System.out.println("Name= "+emp.getName()+" salary= "+emp.getSalary()));
		
		

	}

}
