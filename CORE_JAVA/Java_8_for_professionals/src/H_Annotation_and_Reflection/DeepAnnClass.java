package H_Annotation_and_Reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

public class DeepAnnClass {

	@PieAnnotation(pieValue = 3.14)
	public double deepPie;
	
	public int x=5;

	public void getPieDetails() {
		System.out.println("pie = " + deepPie);
	}

	public static void main(String[] args) throws NoSuchFieldException {
		
		System.out.println("CUSTOM ANNOTATION USE FOR SPECIFIC SETTING");
		
		ProcessAnno processAnno = new ProcessAnno();
		processAnno.processTheAnno();
	}
}

class ProcessAnno {
	void processTheAnno() {

		Class<DeepAnnClass> classData = DeepAnnClass.class;
		DeepAnnClass d2= new DeepAnnClass();

		for (Field f : classData.getDeclaredFields()) {
			
			PieAnnotation myField = f.getAnnotation(PieAnnotation.class);
			
			if (myField == null) {
				break;
			}
			
			double annSetValue = myField.pieValue();			
			
			//set value in class field.
			d2.deepPie= annSetValue;
			d2.getPieDetails();
		}
	}
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface PieAnnotation {
	double pieValue() default 0.1;
}
