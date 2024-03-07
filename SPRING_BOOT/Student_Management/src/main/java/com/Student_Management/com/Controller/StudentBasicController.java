package com.Student_Management.com.Controller;

//import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.Student_Management.com.BasicStudData.StudenBasic;

import java.util.ArrayList;
import java.util.List;

//import com.Student_Management.com.BasicStudData.StudenBasic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class StudentBasicController {

	ArrayList<StudenBasic> studenBasicsList = new ArrayList<StudenBasic>();

	@GetMapping("/student")
	public List<StudenBasic> getAllStudenBasics() {

		if (studenBasicsList.isEmpty()) {
			studenBasicsList.add(new StudenBasic(1L, "Deepak", "CS", "I"));
		}

		return studenBasicsList;
	}

	@GetMapping("/student/{id}")
	public StudenBasic getMethodName(@PathVariable Long id) {

		for (StudenBasic studenBasic : studenBasicsList) {
			if (studenBasic.getId() == id) {
				return studenBasic;
			}
		}
		return null;

	}

	@PostMapping("/student")
	public String postStudenBasic(@RequestBody StudenBasic entity) {
		//System.out.println(entity);
		
//		if (studenBasicsList.add(new StudenBasic(entity.getId(), entity.getName(), entity.getDepartment(), entity.getSemester()) )) {
//			return entity;
//		}
		return "Test-OP";
	}

	@PutMapping("student/{id}")
	public List<StudenBasic> putMethodName(@PathVariable Long id, @RequestBody StudenBasic entity) {

		for (StudenBasic studenBasic : studenBasicsList) {
			if (studenBasic.getId() == id) {
				System.out.println("I found id" + id);
			}
		}

		return studenBasicsList;
	}

}
