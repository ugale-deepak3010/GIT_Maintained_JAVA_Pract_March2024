package G_OtherJavaFeatures;

import java.util.Map;

public class students {
	private String firstname;
	private String lastname;
	private String major;
	private Map<String, Integer> grades;

	public students(String firstname, String lastname, String major, Map<String, Integer> grades) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.major = major;
		this.grades = grades;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getMajor() {
		return major;
	}

	public Map<String, Integer> getGrades() {
		return grades;
	}
}