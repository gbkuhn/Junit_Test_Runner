//import org.junit.Test;

import java.lang.reflect.Method;

public class PriorityAnnotationParser {
    public void parse(Class<?> clazz) throws Exception {
        Method[] methods = clazz.getMethods();
        int pass = 0;
        int fail = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(Priority.class)) {
                // this is how you access to the attributes
                Priority test = method.getAnnotation(Priority.class);
                Class expected = test.expected();
                try {
                    method.invoke(null);
                    pass++;
                } catch (Exception e) {
                    if (Exception.class != expected) {
                        fail++;
                    } else {
                        pass++;
                    }
                }
            }
        }
    }
}
