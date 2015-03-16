import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)//will retain this annotation at JVM runetime, allows for java reflection
public @interface Priority {

    String info() default " Test ";
}
