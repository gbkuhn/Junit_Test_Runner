import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by geoffreykuhn on 3/22/15.
 */
@Retention( value = RetentionPolicy.RUNTIME)
@Target( value = { METHOD})
public @interface Priority {

    boolean priority_bool() default false;
}
