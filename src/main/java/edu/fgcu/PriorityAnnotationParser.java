package main.java.edu.fgcu.Junit_Test_Runner;
//import org.junit.Test;

import java.lang.reflect.Method;

public class PriorityAnnotationParser {
    public String[] parse(Class<?> class_buffer) throws Exception {
        Method[] methods = class_buffer.getMethods();
        int index=0;
        String[] priorityMethods = new String[methods.length];
        for (Method method : methods) {
            if (method.isAnnotationPresent(Desired.class)) {
                priorityMethods[index] = method.getName();
                index++;
                /*
                //access to the attributes
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
                */
            }
        }
        return priorityMethods;
    }
}


