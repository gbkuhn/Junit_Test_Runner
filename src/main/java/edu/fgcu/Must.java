package main.java.edu.fgcu;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import main.java.edu.fgcu.Desired.None;

/**
 * Created by geoffreykuhn on 4/5/15.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Must {
    String name() default "";
    Class<? extends Throwable> expected() default None.class;

    static class None extends Throwable {
    }

}