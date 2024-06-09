package com.DependencyInjDemo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	
	int techId;
	int techName;
	
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public int getTechName() {
		return techName;
	}
	public void setTechName(int techName) {
		this.techName = techName;
	}
	
	public void tech(){
		System.out.println("Completed ! ");
	}
	
}
