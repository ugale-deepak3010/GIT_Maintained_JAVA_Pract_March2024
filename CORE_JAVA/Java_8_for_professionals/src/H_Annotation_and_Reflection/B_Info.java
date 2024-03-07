package H_Annotation_and_Reflection;

@A_MyCustAnnotation(priority = 4, tags = {"IMP", "Deeper"})
public class B_Info {

	@A_MyCustAnnotation(tags = {"details"})
	public void getDeatils() {
		System.out.println("some process...");
	}
	
	public static void main(String[] args) {
		

	}

	public B_Info() {
		
	}

}
