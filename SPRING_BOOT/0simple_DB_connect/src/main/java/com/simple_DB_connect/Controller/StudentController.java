package com.simple_DB_connect.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.simple_DB_connect.Application;
import com.simple_DB_connect.Model.StudentModel;
import com.simple_DB_connect.Service.StudentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {
	
	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentMe")
	public String getstudentName() {
		logger.info("Deeeeeeeeeeeeeeeeeeeeeeeeeepak");
		
		return studentService.studentNames();
	}
	
	
	@GetMapping("/student0")
	public StudentModel getMethodName() {
		return new StudentModel();
	}
	
	@GetMapping("/student")
	public StudentModel getAllStudent() {
		
		
		return studentService.getAllStudentData();
	}
	
	
	@PostMapping("/student")
	public StudentModel postMethodName(@RequestBody StudentModel studentModel) {
		
		return studentService.addStudent(studentModel);
	}
	
	
}
