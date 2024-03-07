package IMP;

import java.util.Map;

public class StudentsGrade {
	
	private String name;
	private Map<String , Integer> subjectMap;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Integer> getSubjectMap() {
		return subjectMap;
	}
	public void setSubjectMap(Map<String, Integer> subjectMap) {
		this.subjectMap = subjectMap;
	}
	
	public StudentsGrade(String name, Map<String, Integer> subjectMap) {
		super();
		this.name = name;
		this.subjectMap = subjectMap;
	}
	
	

}
