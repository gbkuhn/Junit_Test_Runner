import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by geoffreykuhn on 3/24/15.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Desired {
    String name() default "";
//missing state
    Class<? extends Throwable> expected() default None.class;

    static class None extends Throwable {
    }

}
