package com.DependencyInjDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	
	int custId;
	String custName;
	String courseName;
	
	@Autowired
	private Technologies techDeatails;
	
	public Technologies getTechDeatails() {
		return techDeatails;
	}
	
	public void setTechDeatails(Technologies techDeatails) {
		this.techDeatails = techDeatails;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void display() {
		System.out.println("Customer object is returned! ");
		techDeatails.tech();
	}
	
	
	
	

}
