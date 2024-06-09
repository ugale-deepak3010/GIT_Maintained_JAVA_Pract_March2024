package com.SubmissionForm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customers {
	
	@Id
	private int cId;
	
	private String cName;
	private String cEmail;
	
	@Override
	public String toString() {
		return "Customers [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + "]";
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	
	
}
