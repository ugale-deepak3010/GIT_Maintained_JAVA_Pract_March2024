package com.simple_DB_connect.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple_DB_connect.Model.StudentModel;
import com.simple_DB_connect.Model.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentModel studentModel;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public String studentNames() {
		
		studentModel.setName("Deepak");
		
		return studentModel.getName();
	}
	
	public StudentModel addStudent(StudentModel studentModel) {
				
		return studentRepository.save(studentModel);
	}
	
	
	public StudentModel getAllStudentData() {
		
		StudentModel studentModel =  (StudentModel) studentRepository.findAll();
		System.err.println("-----------");
		return studentModel;
	}

}
