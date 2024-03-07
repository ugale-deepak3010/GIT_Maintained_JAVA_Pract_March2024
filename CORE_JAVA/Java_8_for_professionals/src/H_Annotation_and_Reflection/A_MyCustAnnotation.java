package H_Annotation_and_Reflection;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

@Documented
@Retention(RUNTIME)
//@Target({ METHOD, LOCAL_VARIABLE  })
public @interface A_MyCustAnnotation {

	int priority() default 1;
	
	String[] tags() default{};
}
