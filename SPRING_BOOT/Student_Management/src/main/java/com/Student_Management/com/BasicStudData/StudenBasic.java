package com.Student_Management.com.BasicStudData;

public class StudenBasic {
	private long id;
	private String name;
	private String department;
	private String semester;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public StudenBasic(long id, String name, String department, String semester) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.semester = semester;
	}
	@Override
	public String toString() {
		return "StudenBasic [id=" + id + ", name=" + name + ", department=" + department + ", semester=" + semester
				+ "]";
	}
	
	

}
