package com.DataRESTDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customers {

	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private String coursename;

	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", coursename=" + coursename + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

}
