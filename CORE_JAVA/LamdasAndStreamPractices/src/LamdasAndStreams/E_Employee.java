package LamdasAndStreams;

public class E_Employee {
	
	private String fistName;
	private String lastName;
	private int yearsOfService;
	private int numberOfDirectReports;
	private E_Employee manager;
	
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearsOfService() {
		return yearsOfService;
	}
	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	public int getNumberOfDirectReports() {
		return numberOfDirectReports;
	}
	public void setNumberOfDirectReports(int numberOfDirectReports) {
		this.numberOfDirectReports = numberOfDirectReports;
	}
	public E_Employee getManager() {
		return manager;
	}
	public void setManager(E_Employee manager) {
		this.manager = manager;
	}
	
	

}
