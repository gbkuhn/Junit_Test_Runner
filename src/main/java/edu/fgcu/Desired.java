package main.java.edu.fgcu;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import main.java.edu.fgcu.Runner_info.Priority;

/**
 * Created by geoffreykuhn on 3/24/15.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Desired {
    
	String name() default "";
    Class<? extends Throwable> expected() default None.class;
    
    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    Priority priority() default Priority.MEDIUM;

    static class None extends Throwable {
    }

	public int mem_usage() default 80;
    
}
