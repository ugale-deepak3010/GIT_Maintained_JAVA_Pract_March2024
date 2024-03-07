package H_Annotation_and_Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class C_AnnotationsMethods {

	public static void main(String[] args) {
	
		System.out.println("===");
		
		Class<B_Info> classData= B_Info.class;
		
		if (classData.isAnnotationPresent(A_MyCustAnnotation.class)) {
			A_MyCustAnnotation annotation= classData.getAnnotation(A_MyCustAnnotation.class);
			System.out.println(annotation.priority());
			System.out.println( Arrays.toString(annotation.tags()) );
		}
		
		
		
		for(Method method: classData.getDeclaredMethods()) {
			if (method.isAnnotationPresent(A_MyCustAnnotation.class)) {
				System.out.println("---");
				
				A_MyCustAnnotation annotation= method.getAnnotation(A_MyCustAnnotation.class);
				
				System.out.println(method.getName());
				System.out.println(annotation.priority());
				System.out.println("tags: "+ Arrays.toString(annotation.tags()));
			}
		}
	}

}
