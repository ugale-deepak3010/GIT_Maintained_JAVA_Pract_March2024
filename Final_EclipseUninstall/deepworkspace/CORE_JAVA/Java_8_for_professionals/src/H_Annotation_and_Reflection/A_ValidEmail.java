package H_Annotation_and_Reflection;

import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({ LOCAL_VARIABLE })

public @interface A_ValidEmail {

	String message() default "Invalid Email format!";
}
