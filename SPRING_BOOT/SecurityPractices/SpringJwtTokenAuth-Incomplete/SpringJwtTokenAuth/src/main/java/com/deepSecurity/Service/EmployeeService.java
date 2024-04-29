package com.deepSecurity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.deepSecurity.Model.Employee;
import com.deepSecurity.Model.EmployeeRepo;

@Service
public class EmployeeService {
	
	

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Bean
	public void initEmp() {
		
		if (employeeRepo.findAll().isEmpty()) {
			employeeRepo.save(new Employee(1, "Deepak", "dipak@email.co"));
		}
		
	}

	public List<Employee> getAllEmployee() {

		return employeeRepo.findAll();
	}

	public Employee getEmployeeByEmail(String email) {

		return employeeRepo.findAll().stream().filter(employee -> employee.getEmail().equals(email)).findAny()
				.orElse(null);
	}

	public Employee addUpdateEmployee(Employee employee) {

		return employeeRepo.save(employee);
	}

	public void deleteEmployee(Employee employee) {

		employeeRepo.delete(employee);

	}

}
