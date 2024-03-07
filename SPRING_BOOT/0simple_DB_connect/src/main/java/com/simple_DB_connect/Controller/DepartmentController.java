package com.simple_DB_connect.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simple_DB_connect.Model.DepartmentModel;
import com.simple_DB_connect.Model.DepartmentRepository;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository departmentRepo;
	
	private DepartmentModel department;
	

	public DepartmentModel getDepartment() {
		return department;
	}


	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}


	@GetMapping("/department/{id}")
	public Optional<DepartmentModel> getAllDepartment(@PathVariable Long id) {
		System.err.println("------------------------------ = "+id);
		return departmentRepo.findById(id);
	}
	
	@GetMapping("/department")
	public List<DepartmentModel> getAlldepartment() {
		
		return departmentRepo.findAll();
	}
	
	
	@PostMapping("/department")
	public DepartmentModel postDepartmentModel(@RequestBody DepartmentModel departmentModel) {
		
		return departmentRepo.save(departmentModel);
	}
	
	@PutMapping("/department")
	public DepartmentModel putDepartmentModel(@RequestBody DepartmentModel departmentModel) {		
		return departmentRepo.save(departmentModel);
	}
	
	@DeleteMapping("/department")
	public DepartmentModel deleteDepartmentModel(@RequestBody DepartmentModel departmentModel) {
		departmentRepo.delete(departmentModel);
		return null;
	}
	
	
	
	
	
	
	
}
